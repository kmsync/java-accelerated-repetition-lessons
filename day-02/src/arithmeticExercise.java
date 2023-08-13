import java.util.Scanner;

public class arithmeticExercise {

    // Simple arithmetic calculation exercise
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first value: ");
        int value = scanner.nextInt();

        System.out.println("First value: " + value);

        System.out.print("Please enter the second value: ");
        int value2 = scanner.nextInt();

        System.out.println("Second value: " + value2);

        System.out.print("Please enter the third value: ");
        int value3 = scanner.nextInt();

        System.out.println("Third value: " + value3);

        System.out.println("Result: " + value * (value2 + value3));
    }
}