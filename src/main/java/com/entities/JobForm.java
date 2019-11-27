package com.entities;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "JOBFORM")
public class JobForm {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name = "CreateDate")
    private String createdate;

    @Column(name = "Manager")
    private String manager;

    @Column(name = "Car")
    private String car;

    @Column(name = "sistem")
    private String sistem;

    @Column(name = "Client")
    private String client;

    @Column(name = "INFO")
    private String info;

    @Column(name = "work")
    private String work;

    @Column(name = "WorkDate")
    @NotNull
    private String workdate;



    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getSistem() {
        return sistem;
    }

    public void setSistem(String sistem) {
        this.sistem = sistem;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWorkdate() {
        return workdate;
    }

    public void setWorkdate(String workdate) {
        this.workdate = workdate;
    }

    @Override
    public String toString() {
        return "JobForm{" +
                "id=" + id +
                ", createdate='" + createdate + '\'' +
                ", manager='" + manager + '\'' +
                ", car='" + car + '\'' +
                ", sistem='" + sistem + '\'' +
                ", client='" + client + '\'' +
                ", info='" + info + '\'' +
                ", work='" + work + '\'' +
                ", workdate='" + workdate + '\'' +
                '}';
    }
}
