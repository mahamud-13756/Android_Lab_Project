package com.example.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home_Page extends AppCompatActivity {
    TextView tvname,tvage,tvcontact,tvaddress;
    Button b_details, b_sDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        tvname=findViewById(R.id.TV_name);
        tvage=findViewById(R.id.TV_age);
        tvcontact=findViewById(R.id.TV_contact);
        tvaddress=findViewById(R.id.TV_address);

        b_details = findViewById(R.id.btn_details);

        b_sDetails = findViewById(R.id.btn_showStudentDetails);



       /* // rcv data from signuppage

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
        tvaddress.setText(address);*/



        b_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddDetails();
            }
        });

        b_sDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShowStudentDetails();
            }
        });



    }

    public void openAddDetails()
    {
        Intent i =new Intent(this,AddDetailsPage.class);

        startActivity(i);
    }


    public void openShowStudentDetails(){
        Intent i = new Intent(this,ShowStudentDetails.class);
        startActivity(i);
    }




}