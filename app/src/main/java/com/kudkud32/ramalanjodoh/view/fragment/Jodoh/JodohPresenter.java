package com.kudkud32.ramalanjodoh.view.fragment.Jodoh;

import android.util.Log;
import android.view.View;

import com.kudkud32.ramalanjodoh.basemvp.BasePresenter;
import com.kudkud32.ramalanjodoh.model.DataWeton;
import com.kudkud32.ramalanjodoh.model.Weton;
import com.kudkud32.ramalanjodoh.service.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/*
 * Created by joedhaalzelvin on 13/05/18.
 */

public class JodohPresenter implements BasePresenter<DataWeton> {
    JodohMvp view;

    JodohPresenter(JodohMvp view){
        this.view = view;
    }

    void getDataWeton(String nama, String tanggal){
        ApiService.newInstance()
                .getWetonService()
                .getDataWeton(nama, tanggal)
                .enqueue(new Callback<Weton>() {
                    @Override
                    public void onResponse(Call<Weton> call, Response<Weton> response) {
                        view.showDataWeton(response.body().getData());
                    }

                    @Override
                    public void onFailure(Call<Weton> call, Throwable t) {
                        view.showError(t.getMessage());
                    }
                });
    }

    @Override
    public void save(DataWeton model) {

    }

    @Override
    public void find(DataWeton param) {

    }

    @Override
    public void findById(DataWeton param) {

    }

    @Override
    public void delete(int id) {

    }
}
