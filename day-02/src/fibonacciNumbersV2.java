import java.util.Scanner;

public class fibonacciNumbersV2 {

    //Calculate Fibonacci numbers up to a desired number
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers should we generate? \n");
        int miktar = scanner.nextInt();

        // 0 1 1 2 3 5 8 13 21 34 55 89 144...

        int num1, num2;

        num1 = 0;
        num2 = 1;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 1; i <= miktar - 2; i = i + 1) {
            int newNum = num1 + num2;
            num1 = num2;
            num2 = newNum;
            System.out.print(num2 + " ");
        }
    }
}