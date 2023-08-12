package com.accelerated.basicConcepts;

import java.util.Scanner;

public class sinCos_tanCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degree;

        System.out.println("Enter the degree:");
        degree = scanner.nextInt();

        while (degree < 0) {
            System.out.println("Re-enter the degree:");
            degree = scanner.nextInt();
        }

        double sin, cos, tan, cot;
        sin = Math.sin(degree);
        cos = Math.cos(degree);
        tan = Math.tan(degree);
        cot = 1 / tan;

        System.out.println("Sin(" + degree + ")=" + sin);
        System.out.println("Cos(" + degree + ")=" + cos);
        System.out.println("Tan(" + degree + ")=" + tan);
        System.out.println("Cot(" + degree + ")=" + cot);
    }
}