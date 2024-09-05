package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "PurchaseOrderHeader", schema = "Purchasing")
public class PurchaseOrderHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PurchaseOrderID", nullable = false)
    private Integer id;

    @ColumnDefault("0")
    @Column(name = "RevisionNumber", columnDefinition = "tinyint not null")
    private Short revisionNumber;

    @ColumnDefault("1")
    @Column(name = "Status", columnDefinition = "tinyint not null")
    private Short status;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EmployeeID", nullable = false)
    private Employee employeeID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VendorID", nullable = false)
    private com.infosupport.demo.entities.Vendor vendorID;

    @ColumnDefault("getdate()")
    @Column(name = "OrderDate", nullable = false)
    private Instant orderDate;

    @Column(name = "ShipDate")
    private Instant shipDate;

    @ColumnDefault("0.00")
    @Column(name = "SubTotal", nullable = false)
    private BigDecimal subTotal;

    @ColumnDefault("0.00")
    @Column(name = "TaxAmt", nullable = false)
    private BigDecimal taxAmt;

    @ColumnDefault("0.00")
    @Column(name = "Freight", nullable = false)
    private BigDecimal freight;

    @ColumnDefault("isnull([SubTotal]+[TaxAmt]+[Freight], 0)")
    @Column(name = "TotalDue", nullable = false)
    private BigDecimal totalDue;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getRevisionNumber() {
        return revisionNumber;
    }

    public void setRevisionNumber(Short revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Employee getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Employee employeeID) {
        this.employeeID = employeeID;
    }

    public com.infosupport.demo.entities.Vendor getVendorID() {
        return vendorID;
    }

    public void setVendorID(com.infosupport.demo.entities.Vendor vendorID) {
        this.vendorID = vendorID;
    }

    public Instant getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Instant orderDate) {
        this.orderDate = orderDate;
    }

    public Instant getShipDate() {
        return shipDate;
    }

    public void setShipDate(Instant shipDate) {
        this.shipDate = shipDate;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(BigDecimal totalDue) {
        this.totalDue = totalDue;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}