package com.accelerated.basicConcepts;

import java.util.Scanner;

public class SimpleMathematicalOperation {

    //Apply simple mathematical operations by receiving data from the user
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value, value2, value3;

        System.out.print("Please enter the first value: ");
        value = scanner.nextInt();

        System.out.print("Please enter the second value: ");
        value2 = scanner.nextInt();

        System.out.print("Please enter the third value: ");
        value3 = scanner.nextInt();

        System.out.println("Your first value: " + value);
        System.out.println("Your second value: " + value2);
        System.out.println("Your third value: " + value3);

        System.out.println("Result: " + value * (value2 + value3));
    }
}