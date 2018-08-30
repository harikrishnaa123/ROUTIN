package com.example.harikrishnaa.routin;

import android.content.Intent;
import android.content.SharedPreferences;
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
    EditText entered_email, entered_name, referral_code;

    /*public static final String DETAILS_PREFS = "details";
    public static final String NAME_KEY = "username";
    public static final String EMAIL_KEY = "useremail";
    public static final String REFERRAL_KEY = "userreferral";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        final String email;

        person_image = findViewById(R.id.person);
        signup_button = findViewById(R.id.signup);
        entered_email = findViewById(R.id.email);
        entered_name = findViewById(R.id.username);
        referral_code = findViewById(R.id.referralcode);
        email = entered_email.getText().toString();

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //saveUserDetails();
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
                if (checked) {
                    person_image.setImageResource(R.drawable.male);
                    //p.getIcon("male");
                    break;
                }
            case R.id.female:
                if (checked) {
                    person_image.setImageResource(R.drawable.female);
                    //p.getIcon("female");
                    break;
                }
        }
    }
    /*private void saveUserDetails(){
        String name = entered_name.getText().toString();
        String email = entered_email.getText().toString();
        String code = referral_code.getText().toString();
        profile p = new profile();
        SharedPreferences prefs = getSharedPreferences(DETAILS_PREFS, 0);
        prefs.edit().putString(NAME_KEY, name).apply();
        p.getName();
        prefs.edit().putString(EMAIL_KEY, email).apply();
        p.getEmail();
        prefs.edit().putString(REFERRAL_KEY, code);
        p.getReferalCode();
    }*/
}
