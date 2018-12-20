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
    private final List<Shareholder> shareholders;
    private final String taxIdNo;

    public Company(Integer externalId, String name, String type, Address address, String krsNumber, Date registerDate, String regon, Money stock, List<Management> management, List<Shareholder> shareholders, String taxIdNo) {
        super(externalId, name, type, address, krsNumber, registerDate);
        this.regon = regon;
        this.stock = stock;
        this.management = management;
        this.shareholders = shareholders;
        this.taxIdNo = taxIdNo;
    }

    public Company(CompanySmall companySmall, String regon, Money stock, List<Management> management, List<Shareholder> shareholders, String taxIdNo) {
        super(companySmall);
        this.regon = regon;
        this.stock = stock;
        this.management = management;
        this.shareholders = shareholders;
        this.taxIdNo = taxIdNo;
    }

    public List<Shareholder> getShareholders() {
        return shareholders;
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

    public String getTaxIdNo() {
        return taxIdNo;
    }
}
