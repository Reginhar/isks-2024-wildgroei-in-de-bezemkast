package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class PurchaseOrderDetailId implements java.io.Serializable {
    private static final long serialVersionUID = -605241099817749182L;
    @Column(name = "PurchaseOrderID", nullable = false)
    private Integer purchaseOrderID;

    @Column(name = "PurchaseOrderDetailID", nullable = false)
    private Integer purchaseOrderDetailID;

    public Integer getPurchaseOrderID() {
        return purchaseOrderID;
    }

    public void setPurchaseOrderID(Integer purchaseOrderID) {
        this.purchaseOrderID = purchaseOrderID;
    }

    public Integer getPurchaseOrderDetailID() {
        return purchaseOrderDetailID;
    }

    public void setPurchaseOrderDetailID(Integer purchaseOrderDetailID) {
        this.purchaseOrderDetailID = purchaseOrderDetailID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PurchaseOrderDetailId entity = (PurchaseOrderDetailId) o;
        return Objects.equals(this.purchaseOrderDetailID, entity.purchaseOrderDetailID) &&
                Objects.equals(this.purchaseOrderID, entity.purchaseOrderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchaseOrderDetailID, purchaseOrderID);
    }

}