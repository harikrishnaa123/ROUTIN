package com.example.harikrishnaa.routin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.View;
import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.widget.Toast;


public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

        loadFragment(new store());

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                selectFragment(item);
                return false;
            }


        });

    }

    private void selectFragment(MenuItem item) {

        item.setChecked(true);
        Fragment fragment;
        switch (item.getItemId()){
            case R.id.navigation_store:
                fragment = new store();
                loadFragment(fragment);
                break;

            case R.id.navigation_delivery:
                fragment = new delivery();
                loadFragment(fragment);
                break;

            case R.id.navigation_plans:
                fragment = new plans();
                loadFragment(fragment);
                break;

            case R.id.navigation_myself:
                fragment = new myself();
                loadFragment(fragment);
                break;
        }
    }

    private void loadFragment(Fragment fragment) {

        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
