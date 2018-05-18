package com.kudkud32.ramalanjodoh.service;

import com.kudkud32.ramalanjodoh.model.Weton;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

/*
 * Created by joedhaalzelvin on 13/05/18.
 */

public interface WetonApi {
    @GET
    Call<Weton> getDataWeton(@Url String url,
                             @Query("service") String service,
                             @Query("nama") String nama,
                             @Query("tanggal") String tanggal);
}
