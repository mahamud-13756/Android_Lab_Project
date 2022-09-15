package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    TextView expression,resultHolder;
    Button b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_0,b_dot,b_plus,b_minus,b_mul,b_div,b_percentage,b_arrow,b_clear,b_equal;

    private String data7,expressionText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        b_1=findViewById(R.id.btn_1);
        b_2=findViewById(R.id.btn_2);
        b_3=findViewById(R.id.btn_3);
        b_4=findViewById(R.id.btn_4);
        b_5=findViewById(R.id.btn_5);
        b_6=findViewById(R.id.btn_6);
        b_7=findViewById(R.id.btn_7);
        b_8=findViewById(R.id.btn_8);
        b_9=findViewById(R.id.btn_9);
        b_0=findViewById(R.id.btn_0);
        b_dot=findViewById(R.id.btn_dot);
        b_plus=findViewById(R.id.btn_plus);
        b_minus=findViewById(R.id.btn_minus);
        b_div=findViewById(R.id.btn_div);
        b_mul=findViewById(R.id.btn_mul);
        b_percentage=findViewById(R.id.btn_percentage);
        b_clear=findViewById(R.id.btn_clear);
        b_equal=findViewById(R.id.btn_equal);


        expression=findViewById(R.id.expression);
        resultHolder=findViewById(R.id.resultHolder);



        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText + "1");
            }
        });


        b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText + "1");
            }
        });


        b_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText + "2");
            }
        });


        b_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText + "3");
            }
        });



        b_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText + "5");
            }
        });



        b_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText + "6");
            }
        });



        b_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText + "7");
            }
        });




        b_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText + "8");
            }
        });



        b_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText + "9");
            }
        });



        b_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText + "0");
            }
        });



        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }


        });



        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }


        });



        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        b_percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}