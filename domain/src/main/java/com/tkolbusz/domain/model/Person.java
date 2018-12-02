package com.tkolbusz.domain.model;

public class Person {
    private final String name;
    private final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        if (surname != null)
            return name + " " + surname;
        else
            return name;
    }
}
