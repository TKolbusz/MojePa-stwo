package com.tkolbusz.domain.model;

public enum CompanyLayer {

    REPRESENTATION("reprezentacja"),
    SHAREHOLDERS("wspolnicy");

    private final String layerName;

    CompanyLayer(String layerName) {
        this.layerName = layerName;
    }

    public String getLayerName() {
        return layerName;
    }

    @Override
    public String toString() {
        return layerName;
    }
}
