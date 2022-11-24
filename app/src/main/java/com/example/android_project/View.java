package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class View extends AppCompatActivity {

    Button b_listView,b_gridView,b_recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        b_listView= findViewById(R.id.btn_listview);
        b_gridView= findViewById(R.id.btn_gridview);
        b_recyclerView= findViewById(R.id.btn_recyclerview);


        b_listView.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

            }
        });

    }
}