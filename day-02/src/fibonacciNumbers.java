public class fibonacciNumbers {

    // Write a program that calculates and display the first 10 Fibonacci numbers
    // EN
    // The Fibonacci sequence is a sequence in which each number is the sum of the two preceding numbers.
    // The numbers that are part of the Fibonacci sequence are known as Fibonacci numbers, usually denoted by Fₙ.
    // TR
    // Fibonacci dizisi, her sayının kendisinden önceki iki sayının toplamı olduğu bir dizidir.
    // Fibonacci dizisinin parçası olan sayılar, genellikle Fₙ ile gösterilen Fibonacci sayıları olarak bilinir.
    public static void main(String[] args) {

        int num1, num2;

        num1 = 0;
        num2 = 1;

        System.out.print(num1 + " " + num2 + " ");

        // Calculate and print the first 10 Fibonacci numbers
        for (int i = 1; i <= 8; i++) {
            int newNum = num1 += num2;
            num1 = num2;
            num2 = newNum;

            System.out.print(num2 + " ");
        }
    }
}