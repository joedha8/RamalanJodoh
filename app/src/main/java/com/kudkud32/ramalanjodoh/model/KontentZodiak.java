
package com.kudkud32.ramalanjodoh.model;

import com.google.gson.annotations.SerializedName;

public class KontentZodiak {

    @SerializedName("kontent")
    private String mKontent;
    @SerializedName("title")
    private String mTitle;

    public String getKontent() {
        return mKontent;
    }

    public void setKontent(String kontent) {
        mKontent = kontent;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
