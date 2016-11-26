package com.example.ruchee.mytestfragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        this.setSupportActionBar(mToolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_fragment1:
                FragmentOne f1 = new FragmentOne();
                FragmentTransaction f1Transaction = getSupportFragmentManager().beginTransaction();
                f1Transaction.replace(R.id.fragment_container, f1);
                f1Transaction.commit();
                break;
            case R.id.action_fragment2:
                FragmentTwo f2 = new FragmentTwo();
                FragmentTransaction f2Transaction = getSupportFragmentManager().beginTransaction();
                f2Transaction.replace(R.id.fragment_container, f2);
                f2Transaction.addToBackStack(null);
                f2Transaction.commit();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
