package com.example.android_project;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ShowStudentDetailsApi
{
    @GET("allStudents.php")
    Call<List<ModelPostData>> GetStudentDetails();
}
