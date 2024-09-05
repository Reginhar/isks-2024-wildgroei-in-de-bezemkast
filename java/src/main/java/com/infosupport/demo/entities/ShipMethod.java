package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "ShipMethod", schema = "Purchasing")
public class ShipMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ShipMethodID", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "Name", nullable = false)
    private String name;

    @ColumnDefault("0.00")
    @Column(name = "ShipBase", nullable = false)
    private BigDecimal shipBase;

    @ColumnDefault("0.00")
    @Column(name = "ShipRate", nullable = false)
    private BigDecimal shipRate;

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

    public BigDecimal getShipBase() {
        return shipBase;
    }

    public void setShipBase(BigDecimal shipBase) {
        this.shipBase = shipBase;
    }

    public BigDecimal getShipRate() {
        return shipRate;
    }

    public void setShipRate(BigDecimal shipRate) {
        this.shipRate = shipRate;
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