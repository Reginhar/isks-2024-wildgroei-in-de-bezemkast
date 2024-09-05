package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "CountryRegionCurrency", schema = "Sales")
public class CountryRegionCurrency {
    @EmbeddedId
    private CountryRegionCurrencyId id;

    @MapsId("countryRegionCode")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CountryRegionCode", nullable = false)
    private CountryRegion countryRegionCode;

    @MapsId("currencyCode")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CurrencyCode", nullable = false)
    private com.infosupport.demo.entities.Currency currencyCode;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public CountryRegionCurrencyId getId() {
        return id;
    }

    public void setId(CountryRegionCurrencyId id) {
        this.id = id;
    }

    public CountryRegion getCountryRegionCode() {
        return countryRegionCode;
    }

    public void setCountryRegionCode(CountryRegion countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
    }

    public com.infosupport.demo.entities.Currency getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(com.infosupport.demo.entities.Currency currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}