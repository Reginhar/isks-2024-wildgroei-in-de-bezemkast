package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "SalesOrderDetail", schema = "Sales")
public class SalesOrderDetail {
    @EmbeddedId
    private SalesOrderDetailId id;

    @Nationalized
    @Column(name = "CarrierTrackingNumber", length = 25)
    private String carrierTrackingNumber;

    @Column(name = "OrderQty", nullable = false)
    private Short orderQty;

    @Column(name = "UnitPrice", nullable = false)
    private BigDecimal unitPrice;

    @ColumnDefault("0.0")
    @Column(name = "UnitPriceDiscount", nullable = false)
    private BigDecimal unitPriceDiscount;

    @ColumnDefault("isnull([UnitPrice]*(1.0-[UnitPriceDiscount])*[OrderQty], 0.0)")
    @Column(name = "LineTotal", nullable = false, precision = 38, scale = 6)
    private BigDecimal lineTotal;

    @ColumnDefault("newid()")
    @Column(name = "rowguid", nullable = false)
    private UUID rowguid;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public SalesOrderDetailId getId() {
        return id;
    }

    public void setId(SalesOrderDetailId id) {
        this.id = id;
    }

    public String getCarrierTrackingNumber() {
        return carrierTrackingNumber;
    }

    public void setCarrierTrackingNumber(String carrierTrackingNumber) {
        this.carrierTrackingNumber = carrierTrackingNumber;
    }

    public Short getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(Short orderQty) {
        this.orderQty = orderQty;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPriceDiscount() {
        return unitPriceDiscount;
    }

    public void setUnitPriceDiscount(BigDecimal unitPriceDiscount) {
        this.unitPriceDiscount = unitPriceDiscount;
    }

    public BigDecimal getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(BigDecimal lineTotal) {
        this.lineTotal = lineTotal;
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