package com.tkolbusz.domain.model;

import java.util.Date;
import java.util.List;

/**
 * extended version of {@link CompanySmall}
 * it has company details
 */
public class Company extends CompanySmall {
    private final String regon;
    // kapitał zakładowy
    private final Money stock;
    private final List<Management> management;

    public Company(Integer externalId, String name, String type, Address address, String krsNumber, Date registerDate, String regon, Money stock, List<Management> management) {
        super(externalId, name, type, address, krsNumber, registerDate);
        this.regon = regon;
        this.stock = stock;
        this.management = management;
    }

    public String getRegon() {
        return regon;
    }



    public Money getStock() {
        return stock;
    }

    public List<Management> getManagement() {
        return management;
    }
}
