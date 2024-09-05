package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class WorkOrderRoutingId implements java.io.Serializable {
    private static final long serialVersionUID = -8874185037650467609L;
    @Column(name = "WorkOrderID", nullable = false)
    private Integer workOrderID;

    @Column(name = "ProductID", nullable = false)
    private Integer productID;

    @Column(name = "OperationSequence", nullable = false)
    private Short operationSequence;

    public Integer getWorkOrderID() {
        return workOrderID;
    }

    public void setWorkOrderID(Integer workOrderID) {
        this.workOrderID = workOrderID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Short getOperationSequence() {
        return operationSequence;
    }

    public void setOperationSequence(Short operationSequence) {
        this.operationSequence = operationSequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        WorkOrderRoutingId entity = (WorkOrderRoutingId) o;
        return Objects.equals(this.operationSequence, entity.operationSequence) &&
                Objects.equals(this.productID, entity.productID) &&
                Objects.equals(this.workOrderID, entity.workOrderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationSequence, productID, workOrderID);
    }

}