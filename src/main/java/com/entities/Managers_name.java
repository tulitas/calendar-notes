package com.entities;

import javax.persistence.*;

@Entity
@Table(name = "Managers_name", catalog = "calendar")


public class Managers_name implements java.io.Serializable{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Managers_name{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
