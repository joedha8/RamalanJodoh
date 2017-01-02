package com.kudkud32.ramalanjodoh.restInterface;

import com.kudkud32.ramalanjodoh.model.Zodiak;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by WIN 10 on 02/01/2017.
 */

public interface ApiInterface {
    @GET("zodiak")
    Call<Zodiak> getZodiak(@Query("nama") String nama, @Query("tgl") String tanggal);

}
