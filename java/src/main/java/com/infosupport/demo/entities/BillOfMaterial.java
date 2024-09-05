package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "BillOfMaterials", schema = "Production")
public class BillOfMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BillOfMaterialsID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductAssemblyID")
    private com.infosupport.demo.entities.Product productAssemblyID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ComponentID", nullable = false)
    private com.infosupport.demo.entities.Product componentID;

    @ColumnDefault("getdate()")
    @Column(name = "StartDate", nullable = false)
    private Instant startDate;

    @Column(name = "EndDate")
    private Instant endDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UnitMeasureCode", nullable = false)
    private com.infosupport.demo.entities.UnitMeasure unitMeasureCode;

    @Column(name = "BOMLevel", nullable = false)
    private Short bOMLevel;

    @ColumnDefault("1.00")
    @Column(name = "PerAssemblyQty", nullable = false, precision = 8, scale = 2)
    private BigDecimal perAssemblyQty;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public com.infosupport.demo.entities.Product getProductAssemblyID() {
        return productAssemblyID;
    }

    public void setProductAssemblyID(com.infosupport.demo.entities.Product productAssemblyID) {
        this.productAssemblyID = productAssemblyID;
    }

    public com.infosupport.demo.entities.Product getComponentID() {
        return componentID;
    }

    public void setComponentID(com.infosupport.demo.entities.Product componentID) {
        this.componentID = componentID;
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

    public com.infosupport.demo.entities.UnitMeasure getUnitMeasureCode() {
        return unitMeasureCode;
    }

    public void setUnitMeasureCode(com.infosupport.demo.entities.UnitMeasure unitMeasureCode) {
        this.unitMeasureCode = unitMeasureCode;
    }

    public Short getBOMLevel() {
        return bOMLevel;
    }

    public void setBOMLevel(Short bOMLevel) {
        this.bOMLevel = bOMLevel;
    }

    public BigDecimal getPerAssemblyQty() {
        return perAssemblyQty;
    }

    public void setPerAssemblyQty(BigDecimal perAssemblyQty) {
        this.perAssemblyQty = perAssemblyQty;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}