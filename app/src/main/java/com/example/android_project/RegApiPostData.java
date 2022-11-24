package com.example.android_project;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegApiPostData
{
    @FormUrlEncoded
    @POST("registration.php")
    Call<RegResponseModelPost> RegAddData(@Field("name") String name, @Field("email") String email, @Field("password") String password , @Field("address") String address, @Field("contact") String contact);

}
