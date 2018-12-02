
package com.tkolbusz.provider;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class LinksDTO {

    @SerializedName("self")
    @Expose
    private String self;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

}
