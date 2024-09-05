package com.infosupport.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class ProductDocumentId implements java.io.Serializable {
    private static final long serialVersionUID = -7439423969526603579L;
    @Column(name = "ProductID", nullable = false)
    private Integer productID;

    @Column(name = "DocumentNode", columnDefinition = "hierarchyid not null")
    private Object documentNode;

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Object getDocumentNode() {
        return documentNode;
    }

    public void setDocumentNode(Object documentNode) {
        this.documentNode = documentNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductDocumentId entity = (ProductDocumentId) o;
        return Objects.equals(this.documentNode, entity.documentNode) &&
                Objects.equals(this.productID, entity.productID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentNode, productID);
    }

}