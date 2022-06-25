package com.gec.entity;

public class user {
    private String name;
    private String id;
    private String password;
    private String root="normal";

    public user() {
    }

    public user(String name, String id, String password, String root) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.root = root;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", root='" + root + '\'' +
                '}';
    }
}
