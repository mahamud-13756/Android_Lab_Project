package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;

public class Sign_up extends AppCompatActivity {
    EditText name_box,email_box,age_box,contact_box,address_box;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name_box=findViewById(R.id.Name);
        email_box=findViewById(R.id.Email);
        age_box=findViewById(R.id.Age);
        contact_box=findViewById(R.id.Contact);
        address_box=findViewById(R.id.Address);

        signup=findViewById(R.id.btn_Sign_up);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = name_box.getText().toString();
                Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();//kon page,kon data,koto time dekhabo


                String add = address_box.getText().toString();
                Toast.makeText(getApplicationContext(),add,Toast.LENGTH_LONG).show();

               // String age = age_box.getText().toString();
               // Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();

            }
        });

    }
}