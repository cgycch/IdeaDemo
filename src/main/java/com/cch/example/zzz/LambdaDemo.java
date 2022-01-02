package com.cch.example.zzz;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
        Action userA = new userA();
        test("hhh", userA);
        Predicate dd;
        IntPredicate intPrd;
    }

    @FunctionalInterface
    public static interface Action {
        public String read(String content);

        boolean equals(Object obj);

        default void testDefault() {
            System.out.println("Action.testDefault");
        }

        static void testStatic() {
            System.out.println("Action.testStatic");
        }
    }

    public static class userA implements Action {

        @Override
        public String read(String content) {
            System.out.println("userA read: " + content);
            return "userA read";
        }
    }

    public static void test(String str, Action action) {
        action.read(str);
    }
}
