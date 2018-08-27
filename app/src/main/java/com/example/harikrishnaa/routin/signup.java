package com.example.harikrishnaa.routin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class signup extends AppCompatActivity {

    ImageView person_image;
    Button signup_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        person_image = findViewById(R.id.person);
        signup_button = findViewById(R.id.signup);

        signup_button.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.male:
                if (checked)
                    person_image.setImageResource(R.drawable.male2);
                    break;
            case R.id.female:
                if (checked)
                    person_image.setImageResource(R.drawable.female);
                    break;
        }
    }
}
