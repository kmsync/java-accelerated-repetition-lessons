package com.accelerated.basicConcepts;

public class ConditionalExample {
    public static void main(String[] args) {

        int a = 9;
        int b = 9;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);

        System.out.println("---If");

        String city = "ankara";
        int c = 15;

        // And Conditional
        if (city == "ankara" && c == 15) {
            System.out.println("Inside if section..");
            //    if (c == 115) {
            //        System.out.println("c : " + c);
            //    }
            // OR Conditional
            //if (city == "ankara" || c==15) {
            //        System.out.println("Inside if section..");
        } else if (city == "Ankara") {
            System.out.println("Inside other if section..");
        } else {
            System.out.println("Inside else section..");
        }
    }
}