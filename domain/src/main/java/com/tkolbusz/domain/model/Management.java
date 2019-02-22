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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Management that = (Management) o;

        return position != null ? position.equals(that.position) : that.position == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}