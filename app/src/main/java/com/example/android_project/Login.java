package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button btn_cna, btn_fp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_cna = findViewById(R.id.btn_Create_New_Account);
        btn_fp = findViewById(R.id.btn_Forgotten_Password);

        btn_cna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUpPage();
            }
        });

        btn_fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openForgetPage();
            }
        });



    }


    public void openSignUpPage(){
        Intent intent = new Intent(this, Sign_up.class);
        startActivity(intent);
    }


    public void openForgetPage(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }





}