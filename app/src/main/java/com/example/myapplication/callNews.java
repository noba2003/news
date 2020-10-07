package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface callNews {
    @GET("v2/top-headlines?country=eg&apiKey=6fe03459c44043469419051abeee242b")
    Call<News>getService(@Query("category") String s);
}
