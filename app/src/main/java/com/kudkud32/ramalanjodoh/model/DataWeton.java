
package com.kudkud32.ramalanjodoh.model;

import com.google.gson.annotations.SerializedName;

public class DataWeton {

    @SerializedName("lahir")
    private String mLahir;
    @SerializedName("nama")
    private String mNama;
    @SerializedName("ultah")
    private String mUltah;
    @SerializedName("usia")
    private String mUsia;
    @SerializedName("zodiak")
    private String mZodiak;

    public String getLahir() {
        return mLahir;
    }

    public void setLahir(String lahir) {
        mLahir = lahir;
    }

    public String getNama() {
        return mNama;
    }

    public void setNama(String nama) {
        mNama = nama;
    }

    public String getUltah() {
        return mUltah;
    }

    public void setUltah(String ultah) {
        mUltah = ultah;
    }

    public String getUsia() {
        return mUsia;
    }

    public void setUsia(String usia) {
        mUsia = usia;
    }

    public String getZodiak() {
        return mZodiak;
    }

    public void setZodiak(String zodiak) {
        mZodiak = zodiak;
    }

}
