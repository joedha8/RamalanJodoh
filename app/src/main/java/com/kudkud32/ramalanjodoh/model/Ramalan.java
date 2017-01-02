package com.kudkud32.ramalanjodoh.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ramalan {

    @SerializedName("harian")
    @Expose
    private Harian harian;
    @SerializedName("mingguan")

    public Harian getHarian() {
        return harian;
    }

    public void setHarian(Harian harian) {
        this.harian = harian;
    }



}