package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import org.json.JSONObject;

import java.util.Objects;

public class Login extends AppCompatActivity {
    Button btn_cna, btn_fp, login, b_calculator, b_bottleSpinner;
    String email,password,t="Does not Match data";
    TextInputEditText Email,Password;
    TextView showMsg;
    int ck=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_cna = findViewById(R.id.btn_Create_New_Account);
        btn_fp = findViewById(R.id.btn_Forgotten_Password);

        Email= findViewById(R.id.Email);
        Password=findViewById(R.id.Password);

        showMsg = findViewById(R.id.showMsg);

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
                email=Email.getText().toString();
                password=Password.getText().toString();

                //  Box fill up is required!
                if( email.trim().equals(""))
                {
                    Email.setError( "Email is required!" );
                }

                else if( password.trim().equals(""))
                {
                    Password.setError( "password is required!" );
                }
                else{
                    ck=1;
                }



                if(ck==1){



                                 // SharedPreference writing data
                                 SharedPreferences sharedPreferences = getSharedPreferences("userDetails", Context.MODE_PRIVATE);
                                 SharedPreferences.Editor editor = sharedPreferences.edit(); // data write
                                 editor.putString("usenameKey",email);
                                 editor.putString("passwordKey",password);
                                 editor.commit();
                                // Toast.makeText(getApplicationContext(),"Data saved successfully",Toast.LENGTH_SHORT).show();

                    LoadJSON loadTask = new LoadJSON();
                    loadTask.execute();





                    /* // SharedPreferences read data
                SharedPreferences sharedPreferences = getSharedPreferences("userDetails", Context.MODE_PRIVATE);
                // jodi store kora data file er moddhe thake tobe kaj hobe
                if(sharedPreferences.contains("usenameKey") && sharedPreferences.contains("passwordKey")){
                    String username = sharedPreferences.getString("usenameKey","Data not found");
                    String password = sharedPreferences.getString("passwordKey","Data not found");

                    if(uname.equals(username) && pass.equals(password)){
                        openHomePage1();
                    }else{
                        Toast.makeText(getApplicationContext(),"Does not match data",Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"Please store data",Toast.LENGTH_SHORT).show();

                }*/


                }else{
                    Email.setText("");
                    Password.setText("");
                    showMsg.setText("Please enter email and password");
                    showMsg.setTextColor(Color.RED);
                }

               /* // SharedPreferences read data
                SharedPreferences sharedPreferences = getSharedPreferences("userDetails", Context.MODE_PRIVATE);
                // jodi store kora data file er moddhe thake tobe kaj hobe
                if(sharedPreferences.contains("usenameKey") && sharedPreferences.contains("passwordKey")){
                    String username = sharedPreferences.getString("usenameKey","Data not found");
                    String password = sharedPreferences.getString("passwordKey","Data not found");

                    if(uname.equals(username) && pass.equals(password)){
                        openHomePage1();
                    }else{
                        Toast.makeText(getApplicationContext(),"Does not match data",Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"Please store data",Toast.LENGTH_SHORT).show();

                }*/





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
        /*intent.putExtra("Name",n);
        intent.putExtra("Age",ag);
        intent.putExtra("Contact",con);
        intent.putExtra("Address",ad);*/
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

    public void openViewM(){
        Intent i = new Intent(this, View.class);
        startActivity(i);
    }

    public void openHomePage(){
        Intent i = new Intent(this,Home_Page.class);
        startActivity(i);
    }





    //

    class LoadJSON extends AsyncTask< String, Void, String > {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }
        protected String doInBackground(String...args) {

            String urlParameters = "email="+email+"&password="+password;
            Log.e("perm: ",urlParameters);
            String xml = Function.excutePost(Function.host+"login.php", urlParameters);
            return xml;
        }

        @Override
        protected void onPostExecute(String xml) {
            try {
                Log.d("G", "sTARTING onPost");
                if (xml != null) {
                    Log.e("JSON: ",xml);
                    JSONObject jsonObj =  new JSONObject(xml);
                    if(jsonObj.optString("status").contentEquals("true")){
                        Toast.makeText(getApplicationContext(), "Successfull", Toast.LENGTH_SHORT).show();
                        openHomePage();


                    }else{
                        Toast.makeText(getApplicationContext(), "try again", Toast.LENGTH_SHORT).show();
                    }

                }

                else {
                    Log.d("Q", "XML is null");
                }

            } catch (Exception e) {
                Log.d("Error", e.toString());
            }

        }

    }







}