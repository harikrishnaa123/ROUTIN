package com.example.harikrishnaa.routin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    ImageView person_image;
    Button signup_button;
    EditText entered_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        final String email;

        person_image = findViewById(R.id.person);
        signup_button = findViewById(R.id.signup);
        entered_email = findViewById(R.id.email);
        email = entered_email.getText().toString();

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.contains("@") && (!email.isEmpty())){
                    Toast.makeText(getApplicationContext(), "Enter a valid email address", Toast.LENGTH_SHORT).show();
            }else{
                    Intent mIntent = new Intent(getApplicationContext(), location.class);
                    startActivity(mIntent);

                }
            }
        });
        signup_button.setBackgroundColor(getResources().getColor(R.color.green));

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.male:
                if (checked)
                    person_image.setImageResource(R.drawable.male);
                    break;
            case R.id.female:
                if (checked)
                    person_image.setImageResource(R.drawable.female);
                    break;
        }
    }
}
