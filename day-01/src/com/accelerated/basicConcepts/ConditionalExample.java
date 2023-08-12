package com.accelerated.basicConcepts;

public class ConditionalExample {
    public static void main(String[] args) {

        int a = 9;
        int b = 9;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);

        System.out.println("-------------------------------");

        System.out.println("---If");

        String city = "ankara";
        int c = 15;

        // And Conditional &&
        if (city == "ankara" && c == 15) {
            System.out.println("Inside if section..");
        } else if (city == "Ankara") {
            System.out.println("Inside other if section..");
        } else {
            System.out.println("Inside else section..");
        }
        System.out.println("-------------------------------");
        // OR Conditional ||
        if (city == "Ankara" || c == 16) {
            System.out.println("Inside if section..");
        } else if (city == "Ankara") {
            System.out.println("Inside other if section..");
        } else {
            System.out.println("Inside else section..");
        }
        System.out.println("-------------------------------");
        // Ternary Operator ?:
        int x = 69;
        int y = 89;
        int z = 79;

        int largestNumber = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("The largest numbers is:  " + largestNumber);
    }
}