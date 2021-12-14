package com.lionel.appandroid;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

    public interface ApiInterface {
        String BASE_URL = "https://newsapi.org/v2/";

        @GET("top-healines")
        Call<MainNews> getNews(
                @Query("country") String country,
                @Query("pageSize") int pagesize,
                @Query("apiKey") String apikey
        );


        @GET("top-healines")
        Call<MainNews> getCategoriyNews(
                @Query("category") String category,
                @Query("country") String country,
                @Query("pageSize") int pagesize,
                @Query("apiKey") String apikey
        );




}
