package com.example.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home_Page extends AppCompatActivity {
    TextView tvname,tvage,tvcontact,tvaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        tvname=findViewById(R.id.TV_name);
        tvage=findViewById(R.id.TV_age);
        tvcontact=findViewById(R.id.TV_contact);
        tvaddress=findViewById(R.id.TV_address);



        // rcv data from signuppage

        Intent iname = getIntent();
        String name=iname.getStringExtra("Name");
        tvname.setText(name);

        Intent iage = getIntent();
        String age=iage.getStringExtra("Age");
        tvage.setText(age);

        Intent icontact = getIntent();
        String contact=icontact.getStringExtra("Contact");
        tvcontact.setText(contact);

        Intent iaddress = getIntent();
        String address=iaddress.getStringExtra("Address");
        tvaddress.setText(address);



    }




}