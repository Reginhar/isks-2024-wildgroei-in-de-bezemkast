package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "CurrencyRate", schema = "Sales")
public class CurrencyRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CurrencyRateID", nullable = false)
    private Integer id;

    @Column(name = "CurrencyRateDate", nullable = false)
    private Instant currencyRateDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FromCurrencyCode", nullable = false)
    private Currency fromCurrencyCode;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ToCurrencyCode", nullable = false)
    private Currency toCurrencyCode;

    @Column(name = "AverageRate", nullable = false)
    private BigDecimal averageRate;

    @Column(name = "EndOfDayRate", nullable = false)
    private BigDecimal endOfDayRate;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getCurrencyRateDate() {
        return currencyRateDate;
    }

    public void setCurrencyRateDate(Instant currencyRateDate) {
        this.currencyRateDate = currencyRateDate;
    }

    public Currency getFromCurrencyCode() {
        return fromCurrencyCode;
    }

    public void setFromCurrencyCode(Currency fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    public Currency getToCurrencyCode() {
        return toCurrencyCode;
    }

    public void setToCurrencyCode(Currency toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }

    public BigDecimal getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(BigDecimal averageRate) {
        this.averageRate = averageRate;
    }

    public BigDecimal getEndOfDayRate() {
        return endOfDayRate;
    }

    public void setEndOfDayRate(BigDecimal endOfDayRate) {
        this.endOfDayRate = endOfDayRate;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}