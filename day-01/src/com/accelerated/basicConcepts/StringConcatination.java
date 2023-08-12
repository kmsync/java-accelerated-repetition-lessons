package com.accelerated.basicConcepts;

public class StringConcatination {

    public static void main(String[] args) {

        System.out.println("Hello " + " BilgeAdam");
        System.out.println("Hello " + new Student());
    }

    static class Student {
        String name = "Emre";
        int age = 30;

        @Override
        public String toString() {
            return name;
        }
    }
}