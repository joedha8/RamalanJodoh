package com.kudkud32.ramalanjodoh.service;

/**
 * Created by Kristiawan on 07/03/18.
 *
 * this class service for call all service
 * use this class for implemetation
 * editing this class when your creating class service and add method return your service
 */

public class ApiService {

    private static class BaseApiServiceHolder {
        private static final ApiService INSTANCE = new ApiService();
    }

    public static ApiService newInstance() {
        return BaseApiServiceHolder.INSTANCE;
    }

//    public UserService getUserService(){
//        return UserService.getInstance();
//    }
}
