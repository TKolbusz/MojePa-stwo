package com.tkolbusz.domain.model;

public class Management extends Person {
    private final ManagerPosition managerPosition;

    public Management(String fullName, ManagerPosition managerPosition) {
        super(fullName);
        this.managerPosition = managerPosition;
    }

    public ManagerPosition getManagerPosition() {
        return managerPosition;
    }
}