package com.gec.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DeviceRepair {
    private String id;
    private String name;
    private String date= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    private String buyerID;
    private String buyerName;
    private String repairFac;
    private String repairMoney;
    private String headID;
    private String headName;
    private String type;
    private String run="未维修";
    private String repairID;

    public DeviceRepair() {
    }

    public DeviceRepair(String id, String name, String date, String buyerID, String buyerName, String repairFac, String repairMoney, String headID, String headName, String type, String run, String repairID) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.buyerID = buyerID;
        this.buyerName = buyerName;
        this.repairFac = repairFac;
        this.repairMoney = repairMoney;
        this.headID = headID;
        this.headName = headName;
        this.type = type;
        this.run = run;
        this.repairID = repairID;
    }

    @Override
    public String toString() {
        return "DeviceRepair{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", buyerID='" + buyerID + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", repairFac='" + repairFac + '\'' +
                ", repairMoney='" + repairMoney + '\'' +
                ", headID='" + headID + '\'' +
                ", headName='" + headName + '\'' +
                ", type='" + type + '\'' +
                ", run='" + run + '\'' +
                ", repairID='" + repairID + '\'' +
                '}';
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getRepairFac() {
        return repairFac;
    }

    public void setRepairFac(String repairFac) {
        this.repairFac = repairFac;
    }

    public String getRepairMoney() {
        return repairMoney;
    }

    public void setRepairMoney(String repairMoney) {
        this.repairMoney = repairMoney;
    }

    public String getHeadID() {
        return headID;
    }

    public void setHeadID(String headID) {
        this.headID = headID;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getRepairID() {
        return repairID;
    }

    public void setRepairID(String repairID) {
        this.repairID = repairID;
    }
}
