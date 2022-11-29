package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
// delete button function vdo er 29 min a https://www.youtube.com/watch?v=bJHQf8wHWZw
public class Calculator extends AppCompatActivity {
    TextView expression,resultHolder;
    Button b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_0,b_dot,b_plus,b_minus,b_mul,b_div,b_percentage,b_arrow,b_clear,b_equal;

    private String[] BODMAS_RULE = {"÷","×","\\+","-"};

    private int CURRENT_RULE=0;

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
                expression.setText(expressionText + "2");
            }
        });


        b_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText + "3");
            }
        });


        b_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = expression.getText().toString();
                expression.setText(expressionText + "4");
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
                final String expressionText = expression.getText().toString();


                if(expressionText.isEmpty()){
                    expression.setText("0+");

                }
                else{
                    final char getLastCharacter = expressionText.charAt(expressionText.length()-1);

                    if(getLastCharacter=='+' || getLastCharacter=='-' || getLastCharacter=='×' || getLastCharacter=='÷'){
                        expression.setText(expressionText.substring(0,expressionText.length()-1)+"+");
                    }
                    else{
                        expression.setText(expressionText+"+");
                    }
                }
            }
        });



        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String expressionText = expression.getText().toString();


                if(expressionText.isEmpty()){
                    expression.setText("0-");

                }
                else{
                    final char getLastCharacter = expressionText.charAt(expressionText.length()-1);

                    if(getLastCharacter=='+' || getLastCharacter=='-' || getLastCharacter=='×' || getLastCharacter=='÷'){
                        expression.setText(expressionText.substring(0,expressionText.length()-1)+"-");
                    }
                    else{
                        expression.setText(expressionText+"-");
                    }
                }

            }


        });



        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String expressionText = expression.getText().toString();


                if(expressionText.isEmpty()){
                    expression.setText("0÷");

                }
                else{
                    final char getLastCharacter = expressionText.charAt(expressionText.length()-1);

                    if(getLastCharacter=='+' || getLastCharacter=='-' || getLastCharacter=='×' || getLastCharacter=='÷'){
                        expression.setText(expressionText.substring(0,expressionText.length()-1)+"÷");
                    }
                    else{
                        expression.setText(expressionText+"÷");
                    }
                }
            }


        });



        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String expressionText = expression.getText().toString();


                if(expressionText.isEmpty()){
                    expression.setText("0×");

                }
                else{
                    final char getLastCharacter = expressionText.charAt(expressionText.length()-1);

                    if(getLastCharacter=='+' || getLastCharacter=='-' || getLastCharacter=='×' || getLastCharacter=='÷'){
                        expression.setText(expressionText.substring(0,expressionText.length()-1)+"×");
                    }
                    else{
                        expression.setText(expressionText+"×");
                    }
                }
            }
        });


        // delete button function vdo er 29 min a https://www.youtube.com/watch?v=bJHQf8wHWZw

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
                final String expressionText = expression.getText().toString();
                expression.setText("");
                resultHolder.setText("");
            }
        });




        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String expressionText= expression.getText().toString();

                if(expressionText.contains("+") || expressionText.contains("-")|| expressionText.contains("×")|| expressionText.contains("÷")){
                    final char getLastCharacter = expressionText.charAt(expressionText.length()-1);

                    if(getLastCharacter !='+' || getLastCharacter !='-' || getLastCharacter !='×' || getLastCharacter !='÷' ){

                        calculateResult(expression,resultHolder,expressionText);
                    }
                }

            }
        });


    }

    private void calculateResult(TextView expression, TextView resultHolder, String expressionText) {
        String expressionText2= expressionText;

        while(true)
        {
            if(CURRENT_RULE==2 && !expressionText2.contains("+")){
                CURRENT_RULE++;
                continue;
            }
            else if(CURRENT_RULE!=2 && !expressionText2.contains(BODMAS_RULE[CURRENT_RULE])){
                if(CURRENT_RULE==3){
                    break;
                }
                else{
                    CURRENT_RULE++;
                    continue;
                }
            }

            String [] expressionArray = expressionText2.split(BODMAS_RULE[CURRENT_RULE]);

            if(expressionArray.length==1 || expressionArray[0].isEmpty()){
                break;
            }

            StringBuilder firstValue = new StringBuilder();
            StringBuilder secondValue = new StringBuilder();

            for(int i=expressionArray[0].length()-1;i>=0; i--){

                if(expressionArray[0].charAt(i)=='+' || expressionArray[0].charAt(i)=='-' || expressionArray[0].charAt(i)=='×' || expressionArray[0].charAt(i)=='÷') {
                    break;
                }
                else{
                    firstValue.insert(0, expressionArray[0].charAt(i));
                }
            }

            for(int i=0; i<expressionArray[0].length(); i++){
                if(expressionArray[1].charAt(i)=='+' || expressionArray[1].charAt(i)=='-' || expressionArray[1].charAt(i)=='×' || expressionArray[1].charAt(i)=='÷'){
                    break;
                }
                else{
                    secondValue.append((expressionArray[1].charAt(i)));
                }
            }

            double results;

            switch(BODMAS_RULE[CURRENT_RULE]){

                case "÷" :
                    results =Double.parseDouble(firstValue.toString()) / Double.parseDouble(secondValue.toString());
                    break;

                case"×" :

                    results =Double.parseDouble(firstValue.toString()) * Double.parseDouble(secondValue.toString());
                    break;

                case "+" :
                case"\\+" :
                    results =Double.parseDouble(firstValue.toString()) + Double.parseDouble(secondValue.toString());
                    break;

                case "-":
                    results =Double.parseDouble(firstValue.toString()) - Double.parseDouble(secondValue.toString());
                    break;

                default:
                    results=0;

            }

            expressionText2 = expressionText2.replaceFirst(firstValue + BODMAS_RULE[CURRENT_RULE]+ secondValue, String.valueOf(results));

        }

        CURRENT_RULE=0;

        resultHolder.setText(expressionText);

        String [] finalResultArray= expressionText2.split("\\.");

        if(finalResultArray[1].length() == 1 && finalResultArray[1].equals("0")){
            expression.setText(finalResultArray[0]);
        }
        else{
            expression.setText(expressionText2);
        }
    }
}