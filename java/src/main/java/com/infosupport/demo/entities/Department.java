package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "Department", schema = "HumanResources")
public class Department {
    @Id
    @Column(name = "DepartmentID", nullable = false)
    private Short id;

    @Lob
    @Column(name = "Name", nullable = false)
    private String name;

    @Lob
    @Column(name = "GroupName", nullable = false)
    private String groupName;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}