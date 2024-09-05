package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Nationalized;

import java.util.Objects;

@Embeddable
public class CountryRegionCurrencyId implements java.io.Serializable {
    private static final long serialVersionUID = -1083673142394412661L;
    @Nationalized
    @Column(name = "CountryRegionCode", nullable = false, length = 3)
    private String countryRegionCode;

    @Nationalized
    @Column(name = "CurrencyCode", nullable = false, length = 3)
    private String currencyCode;

    public String getCountryRegionCode() {
        return countryRegionCode;
    }

    public void setCountryRegionCode(String countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CountryRegionCurrencyId entity = (CountryRegionCurrencyId) o;
        return Objects.equals(this.countryRegionCode, entity.countryRegionCode) &&
                Objects.equals(this.currencyCode, entity.currencyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryRegionCode, currencyCode);
    }

}