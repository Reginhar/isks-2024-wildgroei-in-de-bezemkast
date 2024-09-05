package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "ProductVendor", schema = "Purchasing")
public class ProductVendor {
    @EmbeddedId
    private ProductVendorId id;

    @MapsId("productID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ProductID", nullable = false)
    private Product productID;

    @MapsId("businessEntityID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BusinessEntityID", nullable = false)
    private com.infosupport.demo.entities.Vendor businessEntityID;

    @Column(name = "AverageLeadTime", nullable = false)
    private Integer averageLeadTime;

    @Column(name = "StandardPrice", nullable = false)
    private BigDecimal standardPrice;

    @Column(name = "LastReceiptCost")
    private BigDecimal lastReceiptCost;

    @Column(name = "LastReceiptDate")
    private Instant lastReceiptDate;

    @Column(name = "MinOrderQty", nullable = false)
    private Integer minOrderQty;

    @Column(name = "MaxOrderQty", nullable = false)
    private Integer maxOrderQty;

    @Column(name = "OnOrderQty")
    private Integer onOrderQty;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public ProductVendorId getId() {
        return id;
    }

    public void setId(ProductVendorId id) {
        this.id = id;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    public com.infosupport.demo.entities.Vendor getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(com.infosupport.demo.entities.Vendor businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Integer getAverageLeadTime() {
        return averageLeadTime;
    }

    public void setAverageLeadTime(Integer averageLeadTime) {
        this.averageLeadTime = averageLeadTime;
    }

    public BigDecimal getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(BigDecimal standardPrice) {
        this.standardPrice = standardPrice;
    }

    public BigDecimal getLastReceiptCost() {
        return lastReceiptCost;
    }

    public void setLastReceiptCost(BigDecimal lastReceiptCost) {
        this.lastReceiptCost = lastReceiptCost;
    }

    public Instant getLastReceiptDate() {
        return lastReceiptDate;
    }

    public void setLastReceiptDate(Instant lastReceiptDate) {
        this.lastReceiptDate = lastReceiptDate;
    }

    public Integer getMinOrderQty() {
        return minOrderQty;
    }

    public void setMinOrderQty(Integer minOrderQty) {
        this.minOrderQty = minOrderQty;
    }

    public Integer getMaxOrderQty() {
        return maxOrderQty;
    }

    public void setMaxOrderQty(Integer maxOrderQty) {
        this.maxOrderQty = maxOrderQty;
    }

    public Integer getOnOrderQty() {
        return onOrderQty;
    }

    public void setOnOrderQty(Integer onOrderQty) {
        this.onOrderQty = onOrderQty;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}