package com.gita.chitwanbazar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText temail,tpass;
    Button tlogin,tregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       temail = (EditText) findViewById(R.id.temail);
        tpass = (EditText) findViewById(R.id.tpass1);
        tlogin = (Button) findViewById(R.id.tlogin);
        tregister = (Button) findViewById(R.id.tregister);
        tlogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               /* String email = temail.getText().toString();
                String pass = tpass.getText().toString();

                if((email.length()>0) && (pass.length()>0)){
                    Toast.makeText(getApplicationContext(),"Fill up the form",Toast.LENGTH_SHORT).show();

                }
                else{
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }*/
                startActivity(new Intent(getApplicationContext(),MainActivity.class));


            }
        });

        tregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),RegisterActivity.class));

            }
        });
    }
}
