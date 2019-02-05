package com.tkolbusz.domain.model;

public class Management extends Person {
    private final String position;

    public Management(String fullName, String position) {
        super(fullName);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}