package com.tkolbusz.domain.model;

public enum ManagerPosition {
    CEO("Prezes Zarządu"), VP("Wiceprezes Zarządu"), OTHER("");
    private final String value;

    ManagerPosition(String value) {
        this.value = value;
    }

    public static ManagerPosition find(String funkcja) {
        for (ManagerPosition value : ManagerPosition.values()) {
            if (value.value.equals(funkcja)) return value;
        }
        return OTHER;
    }

    @Override
    public String toString() {
        return value;
    }
}