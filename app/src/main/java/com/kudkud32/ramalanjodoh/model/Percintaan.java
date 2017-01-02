package com.kudkud32.ramalanjodoh.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Percintaan {

    @SerializedName("single")
    @Expose
    private String single;
    @SerializedName("couple")
    @Expose
    private String couple;

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getCouple() {
        return couple;
    }

    public void setCouple(String couple) {
        this.couple = couple;
    }

}