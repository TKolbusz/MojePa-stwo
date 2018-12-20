package com.tkolbusz.domain.model;

public class Address {
    private final String street;
    private final String streetNumber;
    private final String city;
    private final String country;
    private final String zipCode;

    public Address(String street, String streetNumber, String city, String country, String zipCode) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    /**
     * {street} {streetNumber}
     * {zipCode} {city}
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if (streetNumber != null && street != null) {
            str.append(street);
            str.append(" ");
            str.append(streetNumber);
        }
        if (city != null && zipCode != null) {
            if (str.length() > 0)
                str.append("\n");
            str.append(zipCode);
            str.append(" ");
            str.append(city);
        }
        if (country != null) {
            if (str.length() > 0)
                str.append(", ");
            str.append(country);
        }
        return str.toString();
    }
}
