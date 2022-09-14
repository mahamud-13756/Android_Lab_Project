package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    TextView dtv;
    Button b7,bequal;

    private String data7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b7=findViewById(R.id.f7);
        dtv=findViewById(R.id.downTV);
        bequal=findViewById(R.id.btnEqual);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = dtv.getText().toString();
                dtv.setText(text);
            }
        });




        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data7 = b7.getText().toString();
            }
        });

    }
}