package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Sign_up extends AppCompatActivity {
    EditText name,email,age,contact,address;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name=findViewById(R.id.Name);
        email=findViewById(R.id.Email);
        age=findViewById(R.id.Age);
        contact=findViewById(R.id.Contact);
        address=findViewById(R.id.Address);

        signup=findViewById(R.id.btn_Sign_up);
    }
}