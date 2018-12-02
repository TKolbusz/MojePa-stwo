package com.tkolbusz.domain.model;

class Management {
    private final ManagerPosition managerPosition;
    private final Person person;

    public Management(ManagerPosition managerPosition, Person person) {
        this.managerPosition = managerPosition;
        this.person = person;
    }

    public ManagerPosition getManagerPosition() {
        return managerPosition;
    }

    public Person getPerson() {
        return person;
    }
}
