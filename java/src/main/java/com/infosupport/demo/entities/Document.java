package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "Document", schema = "Production")
public class Document {
    @Id
    @Column(name = "DocumentNode", columnDefinition = "hierarchyid not null")
    private Object id;

    @ColumnDefault("[DocumentNode].[GetLevel]()")
    @Column(name = "DocumentLevel")
    private Short documentLevel;

    @Nationalized
    @Column(name = "Title", nullable = false, length = 50)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Owner", nullable = false)
    private com.infosupport.demo.entities.Employee owner;

    @ColumnDefault("0")
    @Column(name = "FolderFlag", nullable = false)
    private Boolean folderFlag = false;

    @Nationalized
    @Column(name = "FileName", nullable = false, length = 400)
    private String fileName;

    @Nationalized
    @Column(name = "FileExtension", nullable = false, length = 8)
    private String fileExtension;

    @Nationalized
    @Column(name = "Revision", nullable = false, length = 5)
    private String revision;

    @ColumnDefault("0")
    @Column(name = "ChangeNumber", nullable = false)
    private Integer changeNumber;

    @Column(name = "Status", columnDefinition = "tinyint not null")
    private Short status;

    @Nationalized
    @Lob
    @Column(name = "DocumentSummary")
    private String documentSummary;

    @Column(name = "Document")
    private byte[] document;

    @ColumnDefault("newid()")
    @Column(name = "rowguid", nullable = false)
    private UUID rowguid;

    @ColumnDefault("getdate()")
    @Column(name = "ModifiedDate", nullable = false)
    private Instant modifiedDate;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Short getDocumentLevel() {
        return documentLevel;
    }

    public void setDocumentLevel(Short documentLevel) {
        this.documentLevel = documentLevel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public com.infosupport.demo.entities.Employee getOwner() {
        return owner;
    }

    public void setOwner(com.infosupport.demo.entities.Employee owner) {
        this.owner = owner;
    }

    public Boolean getFolderFlag() {
        return folderFlag;
    }

    public void setFolderFlag(Boolean folderFlag) {
        this.folderFlag = folderFlag;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public Integer getChangeNumber() {
        return changeNumber;
    }

    public void setChangeNumber(Integer changeNumber) {
        this.changeNumber = changeNumber;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getDocumentSummary() {
        return documentSummary;
    }

    public void setDocumentSummary(String documentSummary) {
        this.documentSummary = documentSummary;
    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
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