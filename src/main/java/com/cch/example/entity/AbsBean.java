package com.cch.example.entity;

public abstract class AbsBean {
    private String id;
    private String name;

    public abstract String describe();

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
}
