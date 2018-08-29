package com.example.harikrishnaa.routin;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 6000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeInten= new Intent(splash.this,MainActivity.class);
                startActivity(homeInten);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
