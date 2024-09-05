package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "SalesOrderHeader", schema = "Sales")
public class SalesOrderHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SalesOrderID", nullable = false)
    private Integer id;

    @ColumnDefault("0")
    @Column(name = "RevisionNumber", columnDefinition = "tinyint not null")
    private Short revisionNumber;

    @ColumnDefault("getdate()")
    @Column(name = "OrderDate", nullable = false)
    private Instant orderDate;

    @Column(name = "DueDate", nullable = false)
    private Instant dueDate;

    @Column(name = "ShipDate")
    private Instant shipDate;

    @ColumnDefault("1")
    @Column(name = "Status", columnDefinition = "tinyint not null")
    private Short status;

    @ColumnDefault("1")
    @Column(name = "OnlineOrderFlag", nullable = false)
    private Boolean onlineOrderFlag = false;

    @Nationalized
    @ColumnDefault("isnull(N'SO'+CONVERT([nvarchar](23), [SalesOrderID]), N'*** ERROR ***')")
    @Column(name = "SalesOrderNumber", nullable = false, length = 25)
    private String salesOrderNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CustomerID", nullable = false)
    private Customer customerID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BillToAddressID", nullable = false)
    private Address billToAddressID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ShipToAddressID", nullable = false)
    private Address shipToAddressID;

    @Column(name = "CreditCardApprovalCode", length = 15)
    private String creditCardApprovalCode;

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
    @ColumnDefault("newid()")
    @Column(name = "rowguid", nullable = false)
    private UUID rowguid;

    @Nationalized
    @Column(name = "Comment", length = 128)
    private String comment;
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

    public Instant getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Instant orderDate) {
        this.orderDate = orderDate;
    }

    public Instant getDueDate() {
        return dueDate;
    }

    public void setDueDate(Instant dueDate) {
        this.dueDate = dueDate;
    }

    public Instant getShipDate() {
        return shipDate;
    }

    public void setShipDate(Instant shipDate) {
        this.shipDate = shipDate;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Boolean getOnlineOrderFlag() {
        return onlineOrderFlag;
    }

    public void setOnlineOrderFlag(Boolean onlineOrderFlag) {
        this.onlineOrderFlag = onlineOrderFlag;
    }

    public String getSalesOrderNumber() {
        return salesOrderNumber;
    }

    public void setSalesOrderNumber(String salesOrderNumber) {
        this.salesOrderNumber = salesOrderNumber;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public Address getBillToAddressID() {
        return billToAddressID;
    }

    public void setBillToAddressID(Address billToAddressID) {
        this.billToAddressID = billToAddressID;
    }

    public Address getShipToAddressID() {
        return shipToAddressID;
    }

    public void setShipToAddressID(Address shipToAddressID) {
        this.shipToAddressID = shipToAddressID;
    }

    public String getCreditCardApprovalCode() {
        return creditCardApprovalCode;
    }

    public void setCreditCardApprovalCode(String creditCardApprovalCode) {
        this.creditCardApprovalCode = creditCardApprovalCode;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

/*
 TODO [Reverse Engineering] create field to map the 'PurchaseOrderNumber' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "PurchaseOrderNumber", columnDefinition = "OrderNumber")
    private Object purchaseOrderNumber;
*/
/*
 TODO [Reverse Engineering] create field to map the 'AccountNumber' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "AccountNumber", columnDefinition = "AccountNumber")
    private Object accountNumber;
*/
}