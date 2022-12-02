package com.example.android_project;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiPostData {

    @FormUrlEncoded

    @POST("addStudent.php")
    Call<ModelPostData> AddData(
            @Field("name") String name,
            @Field("studentID") String studentID,
            @Field("batchNo") String batchNo ,
            @Field("email") String email,
            @Field("address") String address,
            @Field("contact") String contact
    );

    @POST("addStudent.php?name=Mahamud&email=mahamud@gmail.com&studentID=13756&batch")
    Call<ModelPostData> AddData(@Field("name") String name,@Field("studentID") String studentID,@Field("batchNo") String batchNo , @Field("email") String email,  @Field("address") String address,  @Field("contact") String contact);

