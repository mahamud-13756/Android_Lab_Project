package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class Login extends AppCompatActivity {
    Button btn_cna, btn_fp, login, b_calculator, b_bottleSpinner;
    String uname,pass,u="mahamud",n="Md. Mahamud", p="123456", t="Does not Match data",ag="23",con="01627395446", ad="Dhaka, BD";
    EditText uname_box,pass_box;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_cna = findViewById(R.id.btn_Create_New_Account);
        btn_fp = findViewById(R.id.btn_Forgotten_Password);

        uname_box= findViewById(R.id.ET_username);
        pass_box=findViewById(R.id.ET_password);

        login=findViewById(R.id.btn_Sign_in);

        b_calculator=findViewById(R.id.btn_calculator);

        b_bottleSpinner = findViewById(R.id.btn_bottle_spinner);

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


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uname=uname_box.getText().toString();
                pass=pass_box.getText().toString();

                if(Objects.equals(u, uname) && Objects.equals(p, pass)){
                    openHomePage1();
                }
                else{
                    Toast.makeText(getApplicationContext(),t,Toast.LENGTH_SHORT).show();//kon page,kon data,koto time dekhabo

                }



            }
        });


        // goto calculator page

        b_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalculator();

            }
        });


        b_bottleSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBottleSpinner();
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


    public void openHomePage1(){



        Intent intent=new Intent(this, Home_Page.class);
        intent.putExtra("Name",n);
        intent.putExtra("Age",ag);
        intent.putExtra("Contact",con);
        intent.putExtra("Address",ad);
        startActivity(intent);
    }

    public void openCalculator()
    {
        Intent i =new Intent(this, Calculator.class);
        startActivity(i);
    }


    public void openBottleSpinner(){
        Intent i = new Intent(this, Bottle_Spinner.class);
        startActivity(i);
    }




}