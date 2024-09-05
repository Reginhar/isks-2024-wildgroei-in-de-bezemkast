package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "Product", schema = "Production")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "Name", nullable = false)
    private String name;

    @Nationalized
    @Column(name = "ProductNumber", nullable = false, length = 25)
    private String productNumber;

    @ColumnDefault("1")
    @Column(name = "MakeFlag", nullable = false)
    private Boolean makeFlag = false;

    @ColumnDefault("1")
    @Column(name = "FinishedGoodsFlag", nullable = false)
    private Boolean finishedGoodsFlag = false;

    @Nationalized
    @Column(name = "Color", length = 15)
    private String color;

    @Column(name = "SafetyStockLevel", nullable = false)
    private Short safetyStockLevel;

    @Column(name = "ReorderPoint", nullable = false)
    private Short reorderPoint;

    @Column(name = "StandardCost", nullable = false)
    private BigDecimal standardCost;

    @Column(name = "ListPrice", nullable = false)
    private BigDecimal listPrice;

    @Nationalized
    @Column(name = "\"Size\"", length = 5)
    private String size;

    @Column(name = "Weight", precision = 8, scale = 2)
    private BigDecimal weight;

    @Column(name = "DaysToManufacture", nullable = false)
    private Integer daysToManufacture;

    @Nationalized
    @Column(name = "ProductLine", length = 2)
    private String productLine;

    @Nationalized
    @Column(name = "Class", length = 2)
    private String classField;

    @Nationalized
    @Column(name = "Style", length = 2)
    private String style;

    @Column(name = "SellStartDate", nullable = false)
    private Instant sellStartDate;

    @Column(name = "SellEndDate")
    private Instant sellEndDate;

    @Column(name = "DiscontinuedDate")
    private Instant discontinuedDate;

    @ColumnDefault("newid()")
    @Column(name = "rowguid", nullable = false)
    private UUID rowguid;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public Boolean getMakeFlag() {
        return makeFlag;
    }

    public void setMakeFlag(Boolean makeFlag) {
        this.makeFlag = makeFlag;
    }

    public Boolean getFinishedGoodsFlag() {
        return finishedGoodsFlag;
    }

    public void setFinishedGoodsFlag(Boolean finishedGoodsFlag) {
        this.finishedGoodsFlag = finishedGoodsFlag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Short getSafetyStockLevel() {
        return safetyStockLevel;
    }

    public void setSafetyStockLevel(Short safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }

    public Short getReorderPoint() {
        return reorderPoint;
    }

    public void setReorderPoint(Short reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public BigDecimal getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(BigDecimal standardCost) {
        this.standardCost = standardCost;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getDaysToManufacture() {
        return daysToManufacture;
    }

    public void setDaysToManufacture(Integer daysToManufacture) {
        this.daysToManufacture = daysToManufacture;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getClassField() {
        return classField;
    }

    public void setClassField(String classField) {
        this.classField = classField;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Instant getSellStartDate() {
        return sellStartDate;
    }

    public void setSellStartDate(Instant sellStartDate) {
        this.sellStartDate = sellStartDate;
    }

    public Instant getSellEndDate() {
        return sellEndDate;
    }

    public void setSellEndDate(Instant sellEndDate) {
        this.sellEndDate = sellEndDate;
    }

    public Instant getDiscontinuedDate() {
        return discontinuedDate;
    }

    public void setDiscontinuedDate(Instant discontinuedDate) {
        this.discontinuedDate = discontinuedDate;
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

}