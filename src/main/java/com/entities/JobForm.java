package com.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "JOBFORM", catalog = "calendar")
public class JobForm implements java.io.Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private String workdate;

    @Column(name = "Action")
    private String action;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Comment")
    private String comment;

    @Column(name = "Ordernum")
    private String ordernum;

    @Column(name = "Price")
    private String price;

    @Column(name = "Car_model")
    private String car_model;

    @Column(name = " Car_year")
    private String car_year;

    @Column(name = " Car_plate")
    private String car_plate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public String getCar_year() {
        return car_year;
    }

    public void setCar_year(String car_year) {
        this.car_year = car_year;
    }

    public String getCar_plate() {
        return car_plate;
    }

    public void setCar_plate(String car_plate) {
        this.car_plate = car_plate;
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
                ", action='" + action + '\'' +
                ", phone='" + phone + '\'' +
                ", comment='" + comment + '\'' +
                ", ordernum='" + ordernum + '\'' +
                ", price='" + price + '\'' +
                ", car_model='" + car_model + '\'' +
                ", car_year='" + car_year + '\'' +
                ", car_plate='" + car_plate + '\'' +
                '}';
    }
}
