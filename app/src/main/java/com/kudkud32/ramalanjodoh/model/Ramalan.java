package com.kudkud32.ramalanjodoh.model;

/**
 * Created by TRW on 5/20/2018.
 */

public class Ramalan {
    private int img_zodiak_bg;
    private int img_zodiak;
    private String nama_zodiak;
    private String tanggal;

    public Ramalan(int img_zodiak_bg, int img_zodiak, String nama_zodiak, String tanggal) {
        this.img_zodiak_bg = img_zodiak_bg;
        this.img_zodiak = img_zodiak;
        this.nama_zodiak = nama_zodiak;
        this.tanggal = tanggal;
    }

    public int getImg_zodiak_bg() {
        return img_zodiak_bg;
    }

    public void setImg_zodiak_bg(int img_zodiak_bg) {
        this.img_zodiak_bg = img_zodiak_bg;
    }

    public int getImg_zodiak() {
        return img_zodiak;
    }

    public void setImg_zodiak(int img_zodiak) {
        this.img_zodiak = img_zodiak;
    }

    public String getNama_zodiak() {
        return nama_zodiak;
    }

    public void setNama_zodiak(String nama_zodiak) {
        this.nama_zodiak = nama_zodiak;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
