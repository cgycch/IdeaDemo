package com.cch.example.service;

public class ActionImpl implements Action {
    @Override
    public String eat() {
        return "eat meat";
    }

    @Override
    public String say() {
        return "hello world";
    }

    @Override
    public String run() {
        return "i can fly";
    }
}
