package com.kudkud32.ramalanjodoh.service;


import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.kudkud32.ramalanjodoh.common.ApiUrl;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Kristiawan on 06/03/18.
 *
 * this is config retrofit for request API
 * please, do not change or editing this class
 */

public class ApiConfig {

    private Retrofit retrofit;

    private ApiConfig() {
        retrofit = new Retrofit.Builder()
                .baseUrl(ApiUrl.BASE_API)
                .callbackExecutor(Executors.newCachedThreadPool())
                .validateEagerly(true)
                .addConverterFactory(GsonConverterFactory.create())
                .client(setupOkHttpClient().build())
                .build();
    }

    private static class ApiConfigHolder {

        private static final ApiConfig INSTANCE = new ApiConfig();
    }

    public static ApiConfig getInstance() {
        return ApiConfigHolder.INSTANCE;
    }

    private OkHttpClient.Builder setupOkHttpClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.connectTimeout(0, TimeUnit.SECONDS);
        httpClient.readTimeout(0, TimeUnit.SECONDS);
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        httpClient.addInterceptor(logging);
        return httpClient;
    }

    public <T> T create(Class<T> T) {
        return retrofit.create(T);
    }
}
