package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ShowStudentDetails extends AppCompatActivity {
    TextView id,name,email,batchid,contact,address,tv;
    String Url5="https://www.imraju.com/labfinal/api/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_student_details);

        /*id = findViewById(R.id.id);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        batchid = findViewById(R.id.batchid);
        contact = findViewById(R.id.contact);
        address = findViewById(R.id.address);*/

        tv = findViewById(R.id.tv);
        tv.setText("");


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Url5)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        ShowStudentDetailsApi showStudentDetailsApi = retrofit.create(ShowStudentDetailsApi.class);


        Call<List<ModelPostData>> call5 = showStudentDetailsApi.GetStudentDetails();

        call5.enqueue(new Callback<List<ModelPostData>>() {
            @Override
            public void onResponse(Call<List<ModelPostData>> call, Response<List<ModelPostData>> response) {
                List<ModelPostData> DATA = response.body();

                for(int i = 0; i< 8; i++) {
                    tv.append("ID: " +  DATA.get(i).getStudentID()  +
                            "\nName:" + DATA.get(i).getName() +
                            "\nEmail:" + DATA.get(i).getEmail() +
                            "\nBatch ID:" + DATA.get(i).getBatchNo() +
                            "\nContact:" + DATA.get(i).getContact() +
                            "\nAddress:" + DATA.get(i).getAddress() +
                            "\n------------------------------------------------\n");
                }
            }

            @Override
            public void onFailure(Call<List<ModelPostData>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.toString(),Toast.LENGTH_LONG).show();
            }
        });





    }




}