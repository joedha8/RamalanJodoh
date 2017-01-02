package com.kudkud32.ramalanjodoh.model;

/**
 * Created by WIN 10 on 02/01/2017.
 */

public class GlobalMasuk {
    public static Masuk getMasuk() {
        return masuk;
    }

    public static void setMasuk(Masuk masuk) {
        GlobalMasuk.masuk = masuk;
    }

    private static  Masuk masuk;
}
