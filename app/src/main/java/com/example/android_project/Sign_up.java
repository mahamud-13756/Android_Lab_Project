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

import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Sign_up extends AppCompatActivity {
    TextInputEditText Name,Password, Email,/*age_box,*/Contact,Address;
    TextView Already_Have_Account;
    Button signup;
    private String name,email, /*age,*/ contact, address,password,username;

    int check=0;

    String url2="https://imraju.com/labfinal/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Name = findViewById(R.id.Name);
        Password = findViewById(R.id.Password);
        Email=findViewById(R.id.Email);
        //age_box=findViewById(R.id.Age);
        Contact=findViewById(R.id.Contact);
        Address=findViewById(R.id.Address);
        Already_Have_Account=findViewById(R.id.AHA);

        signup=findViewById(R.id.btn_Sign_up);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                username = Name.getText().toString();
                password = Password.getText().toString();

                name = Name.getText().toString();
                email= Email.getText().toString();
                //Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();//kon page,kon data,koto time dekhabo

                //age = age_box.getText().toString();

                contact = Contact.getText().toString();

                address = Address.getText().toString();

                required();

                if(check==1){
                    openHomePage();
                }else{
                    Toast.makeText(getApplicationContext(),"Please fill up data field",Toast.LENGTH_SHORT).show();
                }


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

                            // Shared Preference login code
                            /*if(username.equals("") && password.equals("")){
                                Toast.makeText(getApplicationContext(),"Please Enter Data",Toast.LENGTH_SHORT).show();


                               }else{
                                // SharedPreference writing data
                                 SharedPreferences sharedPreferences = getSharedPreferences("userDetails", Context.MODE_PRIVATE);
                                 SharedPreferences.Editor editor = sharedPreferences.edit(); // data write
                                    editor.putString("usenameKey",username);
                                        editor.putString("passwordKey",password);
                                            editor.commit();
                                             Toast.makeText(getApplicationContext(),"Data saved successfully",Toast.LENGTH_SHORT).show();
                                         }*/


            // Reg Add Data code

            Retrofit retrofit= new Retrofit.Builder()
                    .baseUrl(url2)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            RegApiPostData regApiPostData = retrofit.create(RegApiPostData.class);

            Call<RegResponseModelPost> call2 = regApiPostData.RegAddData(name,email,password,address,contact);

            call2.enqueue(new Callback<RegResponseModelPost>() {
                @Override
                public void onResponse(Call<RegResponseModelPost> call, Response<RegResponseModelPost> response) {

                    Name.setText("");
                    Email.setText("");
                    Password.setText("");
                    Address.setText("");
                    Contact.setText("");


                    Toast.makeText(getApplicationContext(),response.toString(),Toast.LENGTH_LONG).show();
                }

                @Override
                public void onFailure(Call<RegResponseModelPost> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),t.toString(),Toast.LENGTH_LONG).show();
                }
            });





/*        i.putExtra("Name",name);

       // i.putExtra("Age",age);

        i.putExtra("Contact",contact);

        i.putExtra("Address",address);*/

        startActivity(i);
    }




    public void required()
    {
        if( name.trim().equals("") )
        {
            Name.setError( "Name name is required!" );
        }

        else if( email.trim().equals("") )
        {
            Email.setError( "Email name is required!" );
        }

        else if( password.trim().equals("") )
        {
            Password.setError( "Password name is required!" );
        }

        else if( contact.trim().equals("") )
        {
            Contact.setError( "Contact name is required!" );
        }

        else if( address.trim().equals("") )
        {
            Address.setError( "Address name is required!" );
        }
        else {
            check=1;
        }
    }


}