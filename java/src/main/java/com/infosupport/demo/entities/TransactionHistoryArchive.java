package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "TransactionHistoryArchive", schema = "Production")
public class TransactionHistoryArchive {
    @Id
    @Column(name = "TransactionID", nullable = false)
    private Integer id;

    @Column(name = "ProductID", nullable = false)
    private Integer productID;

    @Column(name = "ReferenceOrderID", nullable = false)
    private Integer referenceOrderID;

    @ColumnDefault("0")
    @Column(name = "ReferenceOrderLineID", nullable = false)
    private Integer referenceOrderLineID;

    @ColumnDefault("getdate()")
    @Column(name = "TransactionDate", nullable = false)
    private Instant transactionDate;

    @Nationalized
    @Column(name = "TransactionType", nullable = false, length = 1)
    private String transactionType;

    @Column(name = "Quantity", nullable = false)
    private Integer quantity;

    @Column(name = "ActualCost", nullable = false)
    private BigDecimal actualCost;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getReferenceOrderID() {
        return referenceOrderID;
    }

    public void setReferenceOrderID(Integer referenceOrderID) {
        this.referenceOrderID = referenceOrderID;
    }

    public Integer getReferenceOrderLineID() {
        return referenceOrderLineID;
    }

    public void setReferenceOrderLineID(Integer referenceOrderLineID) {
        this.referenceOrderLineID = referenceOrderLineID;
    }

    public Instant getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Instant transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getActualCost() {
        return actualCost;
    }

    public void setActualCost(BigDecimal actualCost) {
        this.actualCost = actualCost;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}