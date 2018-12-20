package com.tkolbusz.domain.model;

public class Management extends Person {
    private final Position position;

    public Management(String fullName, Position position) {
        super(fullName);
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}