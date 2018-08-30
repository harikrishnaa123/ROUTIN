package com.example.harikrishnaa.routin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button ok_buton;
    EditText mphno;
    TextView count;
    String nocount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mphno = findViewById(R.id.phno);
        ok_buton = findViewById(R.id.ok_button);
        count = findViewById(R.id.nocount);


        TextWatcher mTextEditorWatcher = new TextWatcher(){

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                count.setText(String.valueOf(charSequence.length()));
                nocount = count.getText().toString();
                if(nocount.equals("10")){
                    ok_buton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(nocount.equals("10")){
                            Intent mIntent = new Intent(getApplicationContext(), no_verification.class);
                            startActivity(mIntent);
                        }else{
                                Toast.makeText(getApplicationContext(), "Enter a valid mobile number", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        mphno.addTextChangedListener(mTextEditorWatcher);

    }
}
