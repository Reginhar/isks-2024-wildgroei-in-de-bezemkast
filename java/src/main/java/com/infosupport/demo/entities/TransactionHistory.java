package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "TransactionHistory", schema = "Production")
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TransactionID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ProductID", nullable = false)
    private Product productID;

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

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
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