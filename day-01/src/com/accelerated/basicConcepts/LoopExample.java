package com.accelerated.basicConcepts;

public class LoopExample {

    public static void main(String[] args) {


        testWithWhileLoop();
        testDoWithWhileLoop();
    }

    private static void testDoWithWhileLoop() {
        int i = 0;
        int a = 0;

        do {
            a += i; // a = a + i;
            i++;

            System.out.println("Inside do section");

        } while (i >= 100);

        System.out.println("Sum: " + a);
    }

    private static void testWithWhileLoop() {
        int i = 0;
        int a = 0;

        while (i <= 100) {
            a += i; // a = a + i;
            i++;
            // System.out.println("Now value of i: " + i);
        }
        System.out.println("Sum: " + a);
    }
}