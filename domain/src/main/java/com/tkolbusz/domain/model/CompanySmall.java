package com.tkolbusz.domain.model;

import com.tkolbusz.domain.util.DateUtils;

import java.util.Date;

/**
 * basic info about company
 */
public class CompanySmall {
    private final Integer externalId;
    private final String name;
    private final String type;
    private final Address address;
    private final String krsNumber;
    private final Date registerDate;

    public CompanySmall(Integer externalId, String name, String type, Address address, String krsNumber, Date registerDate) {
        this.externalId = externalId;
        this.name = name;
        this.type = type;
        this.address = address;
        this.krsNumber = krsNumber;
        this.registerDate = registerDate;
    }

    public CompanySmall(CompanySmall other) {
        this.externalId = other.externalId;
        this.name = other.name;
        this.type = other.type;
        this.address = other.address;
        this.krsNumber = other.krsNumber;
        this.registerDate = other.registerDate;
    }

    public Integer getExternalId() {
        return externalId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public String getRegisterDateFormatted() {
        return DateUtils.formatRegisterDate(registerDate);
    }

    public Address getAddress() {
        return address;
    }

    public String getKrsNumber() {
        return krsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanySmall that = (CompanySmall) o;

        return externalId != null ? externalId.equals(that.externalId) : that.externalId == null;
    }

    @Override
    public int hashCode() {
        return externalId != null ? externalId.hashCode() : 0;
    }
}
