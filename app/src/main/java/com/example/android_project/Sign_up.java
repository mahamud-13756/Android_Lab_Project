package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

public class Sign_up extends AppCompatActivity {
    EditText userName_box,password_box, email_box,age_box,contact_box,address_box;
    TextView Already_Have_Account;
    Button signup;
    private String name, age, contact, address,password,username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        userName_box = findViewById(R.id.s_userName);
        password_box = findViewById(R.id.s_pass);
        email_box=findViewById(R.id.Email);
        age_box=findViewById(R.id.Age);
        contact_box=findViewById(R.id.Contact);
        address_box=findViewById(R.id.Address);
        Already_Have_Account=findViewById(R.id.AHA);

        signup=findViewById(R.id.btn_Sign_up);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                username = userName_box.getText().toString();
                password = password_box.getText().toString();

                name = userName_box.getText().toString();
                Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();//kon page,kon data,koto time dekhabo

                age = age_box.getText().toString();

                contact = contact_box.getText().toString();

                address = address_box.getText().toString();


                openHomePage();

                /*String add = address_box.getText().toString();
                Toast.makeText(getApplicationContext(),add,Toast.LENGTH_SHORT).show();*/

               // String age = age_box.getText().toString();
               // Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();



            }
        });


        Already_Have_Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginActivity();
            }


        });

    }

    public void loginActivity() {
        Intent intent=new Intent(this, Login.class);
        startActivity(intent);
    }


    public void openHomePage(){

        Intent i = new Intent(this, Home_Page.class);


        if(username.equals("") && password.equals("")){
            Toast.makeText(getApplicationContext(),"Please Enter Data",Toast.LENGTH_SHORT).show();


        }else{
            // SharedPreference writing data
            SharedPreferences sharedPreferences = getSharedPreferences("userDetails", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit(); // data write
            editor.putString("usenameKey",username);
            editor.putString("passwordKey",password);
            editor.commit();
            Toast.makeText(getApplicationContext(),"Data saved successfully",Toast.LENGTH_SHORT).show();
        }




        i.putExtra("Name",name);
        //startActivity(iname);

        //Intent iage = new Intent(this, Home_Page.class);
        i.putExtra("Age",age);
        //startActivity(iage);


       // Intent icontact = new Intent(this, Home_Page.class);
        i.putExtra("Contact",contact);
        //startActivity(icontact);

        //Intent iaddress = new Intent(this, Home_Page.class);
        i.putExtra("Address",address);
        startActivity(i);
    }


}