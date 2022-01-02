package com.cch.example.entity;

public class UserBean extends AbsBean {

    private RoleBean role;

    @Override
    public String describe() {
        return this + " with role:"+role.describe();
    }

    public RoleBean getRole() {
        return role;
    }

    public void setRole(RoleBean role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "role=" + role +
                '}';
    }
}
