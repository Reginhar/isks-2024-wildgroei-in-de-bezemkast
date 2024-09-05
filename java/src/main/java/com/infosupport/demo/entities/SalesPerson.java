package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "SalesPerson", schema = "Sales")
public class SalesPerson {
    @Id
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BusinessEntityID", nullable = false)
    private Employee employee;

    @Column(name = "SalesQuota")
    private BigDecimal salesQuota;

    @ColumnDefault("0.00")
    @Column(name = "Bonus", nullable = false)
    private BigDecimal bonus;

    @ColumnDefault("0.00")
    @Column(name = "CommissionPct", nullable = false)
    private BigDecimal commissionPct;

    @ColumnDefault("0.00")
    @Column(name = "SalesYTD", nullable = false)
    private BigDecimal salesYTD;

    @ColumnDefault("0.00")
    @Column(name = "SalesLastYear", nullable = false)
    private BigDecimal salesLastYear;

    @ColumnDefault("newid()")
    @Column(name = "rowguid", nullable = false)
    private UUID rowguid;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public BigDecimal getSalesQuota() {
        return salesQuota;
    }

    public void setSalesQuota(BigDecimal salesQuota) {
        this.salesQuota = salesQuota;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(BigDecimal commissionPct) {
        this.commissionPct = commissionPct;
    }

    public BigDecimal getSalesYTD() {
        return salesYTD;
    }

    public void setSalesYTD(BigDecimal salesYTD) {
        this.salesYTD = salesYTD;
    }

    public BigDecimal getSalesLastYear() {
        return salesLastYear;
    }

    public void setSalesLastYear(BigDecimal salesLastYear) {
        this.salesLastYear = salesLastYear;
    }

    public UUID getRowguid() {
        return rowguid;
    }

    public void setRowguid(UUID rowguid) {
        this.rowguid = rowguid;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}