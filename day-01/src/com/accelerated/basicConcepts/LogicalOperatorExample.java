package com.accelerated.basicConcepts;

public class LogicalOperatorExample {

    public static void main(String[] args) {

        // Conditional_AND();
        // Logical_AND();

        // Error dividing the number by zero.
        int x = 0;
        if ((x != 0) & (1 / x > 1)) {
            System.out.println("Inside of second if..");
        }
    }

    private static void Conditional_AND() {
        int x = 0;
        if (false && (1 == ++x)) {
            System.out.println("Inside in if..");
        }
        System.out.println(x); // 0
    }

    private static void Logical_AND() {
        int x = 0;
        if (false & (1 == ++x)) {
            System.out.println("Inside in if..");
        }
        System.out.println(x); // 1
    }
}