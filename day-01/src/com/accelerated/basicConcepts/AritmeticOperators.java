package com.accelerated.basicConcepts;

public class AritmeticOperators {
    public static void main(String[] args) {

        System.out.println("Inside main method..");

        sayHello();
        System.out.println("------------------------");

        //calculateSum(1,3);
        new AritmeticOperators().calculateSum(10, 5);

        System.out.println("------------------------");

        int a = 18;
        int b = 6;

        System.out.println("Sum " + (a + b));
        System.out.println("Subs. " + (a - b));
        System.out.println("Multiply " + (a * b));
        System.out.println("Devide " + (a / b));

        System.out.println("------------------------");

        //Priority Example
        System.out.println("---Priority");
        System.out.println("Result: " + (a * b + b / 2));

        System.out.println("------------------------");

        //Shorthand Operator Example
        System.out.println("---Shorthand Operator");
        int c = 5;
        //c = c + 15;
        c += 15;     //c = c + 15;
        c -= 15;     //c = c - 15;
        c *= 15;     //c = c * 15;
        c /= 15;     //c = c / 15;
        System.out.println("Result: " + (c));

        //      Other Operators
        //%=	Modulus then assigns
        //<<=	Binary Left Shift  and assigns
        //>>=	Binary Right Shift and assigns
        //>>>=	Shift right zero fill and assigns
        //&=	Binary AND assigns
        //^=	Binary exclusive OR and assigns
        //|=	Binary inclusive OR and assigns

        //c = c + 1;
        c++; //++c
        System.out.println("Result: " + (c));

        //c = c - 1;
        c--; //--c
        System.out.println("Result: " + (c));


        System.out.println("------------------------");

        //Post Increment/Decrement Example
        System.out.println("---Post Increment/Decrement");

        int d = 4;
        int e = d++;
        int f = d--;

        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);

        System.out.println("------------------------");
        System.out.println("---Pre Increment/Decrement");

        d = 4;
        e = ++d;
        f = --d;

        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public int calculateSum(int a, int b) {
        //public int calculateSum( int a, int b){

        System.out.println("Sum " + (a + b));
        return a + b;
    }
}