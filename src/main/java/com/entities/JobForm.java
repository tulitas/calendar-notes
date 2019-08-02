package com.entities;

import javax.persistence.*;

@Entity
@Table(name = "JOBFORM")
public class JobForm {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "Manager")
    private String manager;

    @Column(name = "Car")
    private String car;


    @Column(name = "Customer")
    private String client;

    @Column(name = "INFO")
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }


    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "JobForm{" +
                "id=" + id +
                ", manager='" + manager + '\'' +
                ", car='" + car + '\'' +
                ", client='" + client + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
