package com.example.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apiService {
    private static Retrofit retrofit;
    static callNews getService (){
        if(retrofit==null){
        retrofit=new Retrofit.Builder().baseUrl("https://newsapi.org").addConverterFactory(GsonConverterFactory.create()).build();}
        return retrofit.create(callNews.class);



    }
}
