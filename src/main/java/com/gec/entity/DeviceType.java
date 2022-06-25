package com.gec.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DeviceType {
    private String id;
    private String name;
    private String model;
    private String type;
    private String spec;
    private String price;
    private String date= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    private String factory;
    private String batch;
    private String buyerID;
    private String buyerName;

    public DeviceType() {
    }

    public DeviceType(String id, String name, String model, String type, String spec, String price, String factory, String batch, String buyerID, String buyerName) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.type = type;
        this.spec = spec;
        this.price = price;
        this.factory = factory;
        this.batch = batch;
        this.buyerID = buyerID;
        this.buyerName = buyerName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(String buyerID) {
        this.buyerID = buyerID;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    @Override
    public String toString() {
        return "DeviceType{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", spec='" + spec + '\'' +
                ", price='" + price + '\'' +
                ", date='" + date + '\'' +
                ", factory='" + factory + '\'' +
                ", batch='" + batch + '\'' +
                ", buyerID='" + buyerID + '\'' +
                ", buyerName='" + buyerName + '\'' +
                '}';
    }
}
