package com.kudkud32.ramalanjodoh.service;

import com.kudkud32.ramalanjodoh.common.ApiUrl;
import com.kudkud32.ramalanjodoh.model.Weton;

import retrofit2.Call;

/*
 * Created by joedhaalzelvin on 13/05/18.
 */

public class WetonService extends BaseService<WetonApi> {

    private static WetonService instance;

    static WetonService getInstance() {
        if (instance == null) {
            instance = new WetonService();
        }

        return instance;
    }

    private WetonService(){
        setApi(WetonApi.class);
    }

    public Call<Weton> getDataWeton(String nama, String tanggal){
        return getApi().getDataWeton(ApiUrl.BASE_API_WETON, "AKfycbw7gKzP-WYV2F5mc9RaR7yE3Ve1yN91Tjs91hp_jHSE02dSv9w", nama, tanggal);
    }
}
