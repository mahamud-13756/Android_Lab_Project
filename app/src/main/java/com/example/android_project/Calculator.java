package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    TextView dtv,u_tv;
    Button b_7,b_equal;

    private String data7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b_7=findViewById(R.id.f7);
        dtv=findViewById(R.id.downTV);
        u_tv=findViewById(R.id.tv_up);
        b_equal=findViewById(R.id.btnEqual);

        b_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  String text = dtv.getText().toString();
                u_tv.setText("7");
            }
        });




        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data7 = b_7.getText().toString();
            }
        });

    }
}