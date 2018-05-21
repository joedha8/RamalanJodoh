package com.kudkud32.ramalanjodoh.service;

import com.kudkud32.ramalanjodoh.model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by joedhaalzelvin on 13/05/18.
 */

public interface UserApi {

    @POST
    Call<User> login(@Url String url,
                     @Field("username") String username,
                     @Field("password") String password);
}
