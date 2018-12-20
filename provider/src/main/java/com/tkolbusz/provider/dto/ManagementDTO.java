package com.tkolbusz.provider.dto;

import com.google.gson.annotations.SerializedName;

public class ManagementDTO extends PersonDTO {

    @SerializedName("funkcja")
    private String funkcja;

    public String getFunkcja() {
        return funkcja;
    }

    public void setFunkcja(String funkcja) {
        this.funkcja = funkcja;
    }
}