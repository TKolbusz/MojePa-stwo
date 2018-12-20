package com.tkolbusz.domain.model;

public enum Position {
    CEO("Prezes Zarządu"), VP("Wiceprezes Zarządu"), OTHER("Inny");
    private final String value;

    Position(String value) {
        this.value = value;
    }

    public static Position find(String funkcja) {
        for (Position value : Position.values()) {
            if (value.value.equals(funkcja)) return value;
        }
        return OTHER;
    }

    @Override
    public String toString() {
        return value;
    }
}