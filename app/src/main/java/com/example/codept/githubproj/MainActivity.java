package com.example.codept.githubproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openLogin();
        openRegister();
    }

    public void openLogin() {
        bt = (Button)findViewById(R.id.button);

        bt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.codept.githubproj.login");
                        startActivity(intent);

//fdfodofondsgnkdnfkgn eo trh trbt erubt britbribibr bibijtbrjbrkgbb
                    }
                }
        );
    }

        public void openRegister(){
        bt = (Button) findViewById(R.id.button2);

        bt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.codept.githubproj.register");
                        startActivity(intent);
                    }
                }
        );
    }






}
