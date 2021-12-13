package com.lionel.appandroid;

import retrofit2.Retrofit;

public class ApiUtilities {

    private static Retrofit retrofit = null;

    public static getApiInterface(){

        if (retrofit == null){

            retrofit = new Retrofit.Builder().baseUrl(ApiInterfice.BASE_URL).addConverterFactory()
        }
    }

}
