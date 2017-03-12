package com.example.codept.githubproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
    }
    public void login(){
        final Button login = (Button) findViewById(R.id.signin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText uname = (EditText) findViewById(R.id.namespace);
                EditText password = (EditText) findViewById(R.id.passwordspace);
                {
                    if(uname.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                        Toast.makeText(login.this,"LOGIN SUCCESSFULL", Toast.LENGTH_LONG).show();

                    }
                    else{
                        Toast.makeText(login.this,"INVALID ENTRY", Toast.LENGTH_LONG).show();


                    }
                }
            }

    });
    }

}
