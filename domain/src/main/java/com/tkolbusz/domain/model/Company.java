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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Company company = (Company) o;

        if (regon != null ? !regon.equals(company.regon) : company.regon != null) return false;
        if (stock != null ? !stock.equals(company.stock) : company.stock != null) return false;
        if (management != null ? !management.equals(company.management) : company.management != null)
            return false;
        if (shareholders != null ? !shareholders.equals(company.shareholders) : company.shareholders != null)
            return false;
        return taxIdNo != null ? taxIdNo.equals(company.taxIdNo) : company.taxIdNo == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (regon != null ? regon.hashCode() : 0);
        result = 31 * result + (stock != null ? stock.hashCode() : 0);
        result = 31 * result + (management != null ? management.hashCode() : 0);
        result = 31 * result + (shareholders != null ? shareholders.hashCode() : 0);
        result = 31 * result + (taxIdNo != null ? taxIdNo.hashCode() : 0);
        return result;
    }
}
