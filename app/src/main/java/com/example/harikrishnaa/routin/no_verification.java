package com.example.harikrishnaa.routin;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class no_verification extends AppCompatActivity {

    EditText entered_otp;
    Button ok_buton;
    TextView timer;
    String otpnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_verification);
        ok_buton = findViewById(R.id.button);
        timer = findViewById(R.id.timer);
        entered_otp = findViewById(R.id.otp);
        otpnum = entered_otp.getText().toString();

        new CountDownTimer(50000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
            }
        }.start();



            ok_buton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent mIntent = new Intent(getApplicationContext(), signup.class);
                    startActivity(mIntent);
                    finish();
                }
            });

    }
}
