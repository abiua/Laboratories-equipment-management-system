package com.gec.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DeviceScrap {
    private String id;
    private String name;
    private String type;
    private String date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    private String scrapBatch;

    public DeviceScrap() {
    }

    public DeviceScrap(String id, String name, String type, String date, String scrapBatch) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.date = date;
        this.scrapBatch = scrapBatch;
    }

    @Override
    public String toString() {
        return "DeviceScrap{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", scrapBatch='" + scrapBatch + '\'' +
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getScrapBatch() {
        return scrapBatch;
    }

    public void setScrapBatch(String scrapBatch) {
        this.scrapBatch = scrapBatch;
    }
}
