package com.infosupport.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Entity
@Table(name = "DatabaseLog", schema = "dbo")
public class DatabaseLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DatabaseLogID", nullable = false)
    private Integer id;

    @Column(name = "PostTime", nullable = false)
    private Instant postTime;

    @Nationalized
    @Lob
    @Column(name = "TSQL", nullable = false)
    private String tsql;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getPostTime() {
        return postTime;
    }

    public void setPostTime(Instant postTime) {
        this.postTime = postTime;
    }

    public String getTsql() {
        return tsql;
    }

    public void setTsql(String tsql) {
        this.tsql = tsql;
    }

/*
 TODO [Reverse Engineering] create field to map the 'DatabaseUser' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "DatabaseUser", columnDefinition = "sysname not null")
    private Object databaseUser;
*/
/*
 TODO [Reverse Engineering] create field to map the 'Event' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "Event", columnDefinition = "sysname not null")
    private Object event;
*/
/*
 TODO [Reverse Engineering] create field to map the '\"Schema\"' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "\"Schema\"", columnDefinition = "sysname")
    private Object schema;
*/
/*
 TODO [Reverse Engineering] create field to map the 'Object' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "Object", columnDefinition = "sysname")
    private Object object;
*/
}