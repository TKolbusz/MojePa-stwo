package com.tkolbusz.provider.dto;

import com.google.gson.annotations.SerializedName;

public class PersonDTO {
    @SerializedName("nazwa")
    private String nazwa;
    @SerializedName("data_urodzenia")
    private String dataUrodzenia;
    @SerializedName("privacy_level")
    private String privacyLevel;
    @SerializedName("osoba_id")
    private String osobaId;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getPrivacyLevel() {
        return privacyLevel;
    }

    public void setPrivacyLevel(String privacyLevel) {
        this.privacyLevel = privacyLevel;
    }

    public String getOsobaId() {
        return osobaId;
    }

    public void setOsobaId(String osobaId) {
        this.osobaId = osobaId;
    }
}
