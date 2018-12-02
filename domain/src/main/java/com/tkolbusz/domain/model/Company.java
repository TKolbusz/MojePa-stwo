package com.tkolbusz.domain.model;

import java.util.Date;
import java.util.List;

public class Company {
    private final String name;
    private final String krsNumber;
    private final String regon;
    private final Date registerDate;
    // kapitał zakładowy
    private final Money stock;
    private final Address address;
    private final List<Management> management;

    public Company(String name, String krsNumber, String regon, Date registerDate, Money stock, Address address, List<Management> management) {
        this.name = name;
        this.krsNumber = krsNumber;
        this.regon = regon;
        this.registerDate = registerDate;
        this.stock = stock;
        this.address = address;
        this.management = management;
    }


    public String getName() {
        return name;
    }

    public String getKrsNumber() {
        return krsNumber;
    }

    public String getRegon() {
        return regon;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public Money getStock() {
        return stock;
    }

    public Address getAddress() {
        return address;
    }

    public List<Management> getManagement() {
        return management;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        return krsNumber != null ? krsNumber.equals(company.krsNumber) : company.krsNumber == null;
    }

    @Override
    public int hashCode() {
        return krsNumber != null ? krsNumber.hashCode() : 0;
    }
}
