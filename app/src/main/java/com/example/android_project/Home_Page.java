package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Home_Page extends AppCompatActivity {
    TextView tvfield;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        tvfield=findViewById(R.id.TV);

        // rcv data from signuppage

        Intent i = getIntent();
        String name=i.getStringExtra("Name");

        tvfield.setText(name);
    }
}