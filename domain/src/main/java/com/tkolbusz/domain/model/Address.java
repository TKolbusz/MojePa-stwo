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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        if (streetNumber != null ? !streetNumber.equals(address.streetNumber) : address.streetNumber != null)
            return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (country != null ? !country.equals(address.country) : address.country != null)
            return false;
        return zipCode != null ? zipCode.equals(address.zipCode) : address.zipCode == null;
    }

    @Override
    public int hashCode() {
        int result = street != null ? street.hashCode() : 0;
        result = 31 * result + (streetNumber != null ? streetNumber.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        return result;
    }
}
