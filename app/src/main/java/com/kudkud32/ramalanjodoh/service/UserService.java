package com.kudkud32.ramalanjodoh.service;

import com.kudkud32.ramalanjodoh.common.ApiUrl;
import com.kudkud32.ramalanjodoh.model.User;

import retrofit2.Call;

/**
 * Created by joedhaalzelvin on 13/05/18.
 */

public class UserService extends BaseService<UserApi> {

    private static UserService instance;

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }

        return instance;
    }

    public UserService() {
        setApi(UserApi.class);
    }

    public Call<User> login(String username, String password) {
        return getApi().login(ApiUrl.LOGIN_API, username, password);
    }
}
