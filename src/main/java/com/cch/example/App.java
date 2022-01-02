package com.cch.example;

import com.cch.example.entity.UserBean;

public class App {

    public static void main(String[] args) {
        System.out.println("hello");
        UserBean user = new UserBean();
        user.setName("aaa");
        if ("bbb".equals(user.getName())) {
            System.out.println("bbb is me");
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        String hello = sayHello("AAA");
        if (hello == null || hello.isEmpty()) {
            System.out.println("hello is empty");
        } else {
            System.out.println("hello is " + hello);
        }

        hello = sayHello("BBB");
        if (hello == null || hello.isEmpty()) {
            System.out.println("hello is empty");
        } else {
            System.out.println("hello is " + hello);
        }

        System.out.println("bye");
    }

    private static String sayHello(String hello) {
        String rs = "this is " + hello;
        return rs;
    }
}
