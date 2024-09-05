package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "PurchaseOrderDetail", schema = "Purchasing")
public class PurchaseOrderDetail {
    @EmbeddedId
    private PurchaseOrderDetailId id;

    @Column(name = "DueDate", nullable = false)
    private Instant dueDate;

    @Column(name = "OrderQty", nullable = false)
    private Short orderQty;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ProductID", nullable = false)
    private Product productID;

    @Column(name = "UnitPrice", nullable = false)
    private BigDecimal unitPrice;

    @ColumnDefault("isnull([OrderQty]*[UnitPrice], 0.00)")
    @Column(name = "LineTotal", nullable = false)
    private BigDecimal lineTotal;

    @Column(name = "ReceivedQty", nullable = false, precision = 8, scale = 2)
    private BigDecimal receivedQty;

    @Column(name = "RejectedQty", nullable = false, precision = 8, scale = 2)
    private BigDecimal rejectedQty;

    @ColumnDefault("isnull([ReceivedQty]-[RejectedQty], 0.00)")
    @Column(name = "StockedQty", nullable = false, precision = 9, scale = 2)
    private BigDecimal stockedQty;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public PurchaseOrderDetailId getId() {
        return id;
    }

    public void setId(PurchaseOrderDetailId id) {
        this.id = id;
    }

    public Instant getDueDate() {
        return dueDate;
    }

    public void setDueDate(Instant dueDate) {
        this.dueDate = dueDate;
    }

    public Short getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(Short orderQty) {
        this.orderQty = orderQty;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(BigDecimal lineTotal) {
        this.lineTotal = lineTotal;
    }

    public BigDecimal getReceivedQty() {
        return receivedQty;
    }

    public void setReceivedQty(BigDecimal receivedQty) {
        this.receivedQty = receivedQty;
    }

    public BigDecimal getRejectedQty() {
        return rejectedQty;
    }

    public void setRejectedQty(BigDecimal rejectedQty) {
        this.rejectedQty = rejectedQty;
    }

    public BigDecimal getStockedQty() {
        return stockedQty;
    }

    public void setStockedQty(BigDecimal stockedQty) {
        this.stockedQty = stockedQty;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}