
package com.kudkud32.ramalanjodoh.model;

import com.google.gson.annotations.SerializedName;

public class Weton {

    @SerializedName("data")
    private DataWeton mDataWeton;
    @SerializedName("status")
    private String mStatus;

    public DataWeton getData() {
        return mDataWeton;
    }

    public void setData(DataWeton dataWeton) {
        mDataWeton = dataWeton;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}
