package com.example.retrofitdemo2;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    @GET("marvel")
    Call<ArrayList<TestModel>> MarvelList();   // we can give any name of method instead of MarvelList().
}
