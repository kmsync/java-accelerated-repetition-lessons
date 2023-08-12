package com.accelerated.basicConcepts;

import java.util.Scanner;

public class Polygon {

    // area of a regular polygon
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of sides: ");
        int n = scanner.nextInt();

        System.out.println("enter the side length: ");
        double s= scanner.nextInt();
        double result =(n*s*s)/(4*Math.tan(Math.PI/n));

        System.out.println(result);
    }
}