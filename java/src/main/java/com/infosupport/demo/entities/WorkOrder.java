package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "WorkOrder", schema = "Production")
public class WorkOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WorkOrderID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ProductID", nullable = false)
    private Product productID;

    @Column(name = "OrderQty", nullable = false)
    private Integer orderQty;

    @ColumnDefault("isnull([OrderQty]-[ScrappedQty], 0)")
    @Column(name = "StockedQty", nullable = false)
    private Integer stockedQty;

    @Column(name = "ScrappedQty", nullable = false)
    private Short scrappedQty;

    @Column(name = "StartDate", nullable = false)
    private Instant startDate;

    @Column(name = "EndDate")
    private Instant endDate;

    @Column(name = "DueDate", nullable = false)
    private Instant dueDate;

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

    public Integer getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(Integer orderQty) {
        this.orderQty = orderQty;
    }

    public Integer getStockedQty() {
        return stockedQty;
    }

    public void setStockedQty(Integer stockedQty) {
        this.stockedQty = stockedQty;
    }

    public Short getScrappedQty() {
        return scrappedQty;
    }

    public void setScrappedQty(Short scrappedQty) {
        this.scrappedQty = scrappedQty;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }

    public Instant getDueDate() {
        return dueDate;
    }

    public void setDueDate(Instant dueDate) {
        this.dueDate = dueDate;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}