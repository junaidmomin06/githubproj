package com.example.codept.githubproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register();
    }
    public void register(){
        Button regbtn = (Button) findViewById(R.id.regbutton);
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText) findViewById(R.id.editText);
                String username = name.getText().toString();
                EditText password = (EditText) findViewById(R.id.editText2);
                String user_password = password.getText().toString();
                EditText confirmpassword = (EditText) findViewById(R.id.editText3);
                String reenter_password = confirmpassword.getText().toString();
                Toast.makeText(register.this,"YOU HAVE SUCCESSFULLY REGISTERED"+username+user_password,Toast.LENGTH_LONG).show();

            }
        });
    }
}
