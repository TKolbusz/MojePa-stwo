package com.tkolbusz.provider.dto;

import com.google.gson.annotations.SerializedName;

public class ShareholderDTO extends PersonDTO {

    @SerializedName("krs_id")
    private Object krsId;
    @SerializedName("id")
    private String id;
    @SerializedName("funkcja")
    private String funkcja;
    @SerializedName("udzialy_liczba")
    private Integer udzialyLiczba;
    @SerializedName("udzialy_wartosc_jedn")
    private Double udzialyWartoscJedn;
    @SerializedName("udzialy_wartosc")
    private Double udzialyWartosc;


    public Object getKrsId() {
        return krsId;
    }

    public void setKrsId(Object krsId) {
        this.krsId = krsId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFunkcja() {
        return funkcja;
    }

    public void setFunkcja(String funkcja) {
        this.funkcja = funkcja;
    }

    public Integer getUdzialyLiczba() {
        return udzialyLiczba;
    }

    public void setUdzialyLiczba(Integer udzialyLiczba) {
        this.udzialyLiczba = udzialyLiczba;
    }


    public Double getUdzialyWartoscJedn() {
        return udzialyWartoscJedn;
    }

    public void setUdzialyWartoscJedn(Double udzialyWartoscJedn) {
        this.udzialyWartoscJedn = udzialyWartoscJedn;
    }

    public Double getUdzialyWartosc() {
        return udzialyWartosc;
    }

    public void setUdzialyWartosc(Double udzialyWartosc) {
        this.udzialyWartosc = udzialyWartosc;
    }
}