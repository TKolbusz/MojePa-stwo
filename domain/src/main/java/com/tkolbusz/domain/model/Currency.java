package com.tkolbusz.domain.model;

public enum Currency {

    PLN("PLN"),
    EUR("EUR"),
    GBP("GBP"),
    USD("USD");
    private final String name;

    Currency(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
