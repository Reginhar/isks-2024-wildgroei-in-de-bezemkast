package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "SalesTerritory", schema = "Sales")
public class SalesTerritory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TerritoryID", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "Name", nullable = false)
    private String name;

    @Nationalized
    @Column(name = "\"Group\"", nullable = false, length = 50)
    private String group;

    @ColumnDefault("0.00")
    @Column(name = "SalesYTD", nullable = false)
    private BigDecimal salesYTD;

    @ColumnDefault("0.00")
    @Column(name = "SalesLastYear", nullable = false)
    private BigDecimal salesLastYear;

    @ColumnDefault("0.00")
    @Column(name = "CostYTD", nullable = false)
    private BigDecimal costYTD;

    @ColumnDefault("0.00")
    @Column(name = "CostLastYear", nullable = false)
    private BigDecimal costLastYear;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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

    public BigDecimal getCostYTD() {
        return costYTD;
    }

    public void setCostYTD(BigDecimal costYTD) {
        this.costYTD = costYTD;
    }

    public BigDecimal getCostLastYear() {
        return costLastYear;
    }

    public void setCostLastYear(BigDecimal costLastYear) {
        this.costLastYear = costLastYear;
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