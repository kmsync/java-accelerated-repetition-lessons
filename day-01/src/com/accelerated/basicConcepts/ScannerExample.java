package com.accelerated.basicConcepts;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("\n"); //Space Operator
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Your Age " + age);

    }
}