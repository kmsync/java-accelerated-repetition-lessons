package com.accelerated.basicConcepts;

public class SwitchExample {

    static String str;

    public static void main(String[] args) {

        //String str = "";
        int i = 1;

        switch (i) {
            case 1:
                str = "1- This is " + i;
                break;
            case 2:
                str = "2- This is " + i;
                break;
            case 3:
                str = "3- This is " + i;
                break;
            default:
                str = "Not Found!";
                break;
        }

        System.out.println(str);
    }
}