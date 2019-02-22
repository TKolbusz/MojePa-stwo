package com.tkolbusz.domain.model;

import com.tkolbusz.domain.util.DateUtils;

import java.time.LocalDate;
import java.time.ZoneId;
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
    public int hashCode() {
        return externalId != null ? externalId.hashCode() : 0;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanySmall small = (CompanySmall) o;

        if (externalId != null ? !externalId.equals(small.externalId) : small.externalId != null)
            return false;
        if (name != null ? !name.equals(small.name) : small.name != null) return false;
        if (type != null ? !type.equals(small.type) : small.type != null) return false;
        if (address != null ? !address.equals(small.address) : small.address != null) return false;
        if (krsNumber != null ? !krsNumber.equals(small.krsNumber) : small.krsNumber != null)
            return false;
        if (registerDate == null && small.registerDate == null) return true;
        LocalDate registerDateLocalDate = registerDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate registerDateLocalDateOther = small.registerDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return registerDateLocalDate.isEqual(registerDateLocalDateOther);
    }

}
