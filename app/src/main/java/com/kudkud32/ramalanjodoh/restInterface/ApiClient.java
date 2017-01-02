package com.kudkud32.ramalanjodoh.restInterface;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by WIN 10 on 02/01/2017.
 */

public class ApiClient {
    public static final String BASE_URL ="http://ibacor.com/api/";


    public static Retrofit getClient() {
        HttpLoggingInterceptor login = new HttpLoggingInterceptor();
        login.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(login).build();
        Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client).build();
        return  retrofit;
    }

}
