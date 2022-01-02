package com.cch.example.entity;

public class RoleBean extends AbsBean {
    @Override
    public String describe() {
        return "this is CEO";
    }

    @Override
    public String toString() {
        return describe();
    }
}
