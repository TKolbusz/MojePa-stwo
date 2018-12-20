package com.tkolbusz.provider.dto;

import com.google.gson.annotations.SerializedName;

public class LinksDTO {

    @SerializedName("self")
    private String self;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

}
