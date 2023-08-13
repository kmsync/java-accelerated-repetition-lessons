public class fibonacciNumbersV3 {

    // Define a method to calculate the nth Fibonacci number
    // 25 for this example
    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Calculate and print the first 25 Fibonacci numbers
    public static void main(String[] args) {

        for (int i = 0; i < 25; i++) {

            System.out.println(fibonacci(i));
        }
    }
}