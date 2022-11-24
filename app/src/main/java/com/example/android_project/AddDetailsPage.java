package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AddDetailsPage extends AppCompatActivity {
    EditText s_name,s_id,s_email,s_batch,s_contact,s_address;
    Button add;
    String url="https://www.imraju.com/labfinal/api/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_details_page);

        s_name = findViewById(R.id.s_name);
        s_id = findViewById(R.id.s_id);
        s_batch = findViewById(R.id.s_batch);
        s_email = findViewById(R.id.s_email);
        s_contact = findViewById(R.id.s_contact);
        s_address= findViewById(R.id.s_address);

        add = findViewById(R.id.btn_add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process();
            }
        });


    }

    public void process()
    {
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiPostData api = retrofit.create(ApiPostData.class);

        Call<ModelPostData> call = api.AddData(s_name.getText().toString(),s_id.getText().toString(),s_batch.getText().toString(),s_email.getText().toString(),s_address.getText().toString(),s_contact.getText().toString());

        call.enqueue(new Callback<ModelPostData>() {
            @Override
            public void onResponse(Call<ModelPostData> call, Response<ModelPostData> response) {

                s_name.setText("");
                s_id.setText("");
                s_batch.setText("");
                s_email.setText("");
                s_address.setText("");
                s_contact.setText("");

                Toast.makeText(getApplicationContext(),response.toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<ModelPostData> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }


}