package com.kudkud32.ramalanjodoh;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;

import com.kudkud32.ramalanjodoh.model.GlobalMasuk;
import com.kudkud32.ramalanjodoh.model.Masuk;
import com.kudkud32.ramalanjodoh.model.Zodiak;
import com.kudkud32.ramalanjodoh.restInterface.ApiClient;
import com.kudkud32.ramalanjodoh.restInterface.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Detail extends AppCompatActivity {
    private TextView nama,tgl,umur,zodiak;
    private TextView umum,percintaan,karir,percintaan2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        nama = (TextView)findViewById(R.id.namaMu);
        tgl =(TextView)findViewById(R.id.lahirMu);
        umur=(TextView)findViewById(R.id.umur);
        zodiak=(TextView)findViewById(R.id.zodiakMu);
        umum=(TextView)findViewById(R.id.umum);
        percintaan=(TextView)findViewById(R.id.percintaan);
        karir=(TextView)findViewById(R.id.karir);
        percintaan2=(TextView)findViewById(R.id.percintaan2);

        getData();
    }
    private void getData(){
//        final Masuk masuk = new Masuk();

        String nama1 = GlobalMasuk.getMasuk().getNama();
        String tanggal = GlobalMasuk.getMasuk().getTanggal();
        ApiClient.getClient().create(ApiInterface.class).getZodiak(nama1,tanggal).enqueue(new Callback<Zodiak>() {
            @Override
            public void onResponse(Call<Zodiak> call, Response<Zodiak> response) {

                nama.setText(response.body().getNama());
                tgl.setText(response.body().getLahir());
                umur.setText(response.body().getUsia());
                zodiak.setText(response.body().getZodiak());
                umum.setText(response.body().getRamalan().getHarian().getUmum());
                percintaan.setText(response.body().getRamalan().getHarian().getPercintaan().getSingle());
                percintaan2.setText(response.body().getRamalan().getHarian().getPercintaan().getCouple());
                karir.setText(response.body().getRamalan().getHarian().getKarirKeuangan());
            }

            @Override
            public void onFailure(Call<Zodiak> call, Throwable t) {

            }
        });
    }
}
