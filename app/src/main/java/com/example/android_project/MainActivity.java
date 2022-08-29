package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Create = findViewById(R.id.btn_Create_New_Account);

        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gosignup();
            }


        });


        }
        public void gosignup(){

            Intent intent = new Intent(this, Sign_up.class);
            startActivity(intent);
        }



    }
