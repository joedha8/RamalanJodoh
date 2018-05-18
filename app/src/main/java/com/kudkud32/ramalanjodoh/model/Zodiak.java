
package com.kudkud32.ramalanjodoh.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Zodiak {

    @SerializedName("copyright")
    private String mCopyright;
    @SerializedName("data")
    private List<KontentZodiak> mData;

    public String getCopyright() {
        return mCopyright;
    }

    public void setCopyright(String copyright) {
        mCopyright = copyright;
    }

    public List<KontentZodiak> getData() {
        return mData;
    }

    public void setData(List<KontentZodiak> data) {
        mData = data;
    }

}
