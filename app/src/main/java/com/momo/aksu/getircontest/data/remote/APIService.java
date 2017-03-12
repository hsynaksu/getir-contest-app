package com.momo.aksu.getircontest.data.remote;


import com.momo.aksu.getircontest.data.model.Post;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("/getElements")
    @FormUrlEncoded
    Call<Post> savePost(@Field("email") String email,
                        @Field("name") String katilimciIsmi,
                        @Field("gsm") String katilimciGsm);
}