package com.kudkud32.ramalanjodoh.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Harian {

    @SerializedName("umum")
    @Expose
    private String umum;
    @SerializedName("percintaan")
    @Expose
    private Percintaan percintaan;
    @SerializedName("karir_keuangan")
    @Expose
    private String karirKeuangan;

    public String getUmum() {
        return umum;
    }

    public void setUmum(String umum) {
        this.umum = umum;
    }

    public Percintaan getPercintaan() {
        return percintaan;
    }

    public void setPercintaan(Percintaan percintaan) {
        this.percintaan = percintaan;
    }

    public String getKarirKeuangan() {
        return karirKeuangan;
    }

    public void setKarirKeuangan(String karirKeuangan) {
        this.karirKeuangan = karirKeuangan;
    }

}