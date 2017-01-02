package com.kudkud32.ramalanjodoh.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Zodiak {

    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("lahir")
    @Expose
    private String lahir;
    @SerializedName("usia")
    @Expose
    private String usia;
    @SerializedName("RamalanZodiak")
    @Expose
    private String zodiak;
    @SerializedName("ramalan")
    @Expose
    private Ramalan ramalan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLahir() {
        return lahir;
    }

    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public String getZodiak() {
        return zodiak;
    }

    public void setZodiak(String zodiak) {
        this.zodiak = zodiak;
    }

    public Ramalan getRamalan() {
        return ramalan;
    }

    public void setRamalan(Ramalan ramalan) {
        this.ramalan = ramalan;
    }

}