package com.example.harikrishnaa.routin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ice_creams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_creams);
    }

    public void gotoempty(View view) {
        Intent mIntent = new Intent(getApplicationContext(), empty_1.class);
        startActivity(mIntent);
    }
}
