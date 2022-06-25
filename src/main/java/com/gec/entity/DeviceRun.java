package com.gec.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DeviceRun {
    private String idRun;
    private String nameRun;
    private String run="空闲";
    private String dateRun= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    private String LabName;

    public DeviceRun() {
    }

    public DeviceRun(String idRun, String nameRun, String run, String dateRun, String labName) {
        this.idRun = idRun;
        this.nameRun = nameRun;
        this.run = run;
        this.dateRun = dateRun;
        this.LabName = labName;
    }

    public String getIdRun() {
        return idRun;
    }

    public void setIdRun(String idRun) {
        this.idRun = idRun;
    }

    public String getNameRun() {
        return nameRun;
    }

    public void setNameRun(String nameRun) {
        this.nameRun = nameRun;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getDateRun() {
        return dateRun;
    }

    public void setDateRun(String dateRun) {
        this.dateRun = dateRun;
    }

    public String getLabName() {
        return LabName;
    }

    public void setLabName(String labName) {
        LabName = labName;
    }

    @Override
    public String toString() {
        return "DeviceRun{" +
                "idRun='" + idRun + '\'' +
                ", nameRun='" + nameRun + '\'' +
                ", run='" + run + '\'' +
                ", dateRun='" + dateRun + '\'' +
                ", LabName='" + LabName + '\'' +
                '}';
    }
}
