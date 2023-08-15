package basicConcepts;

// EN
// EXAMPLE:
// Let's write a Java program to automatically generate the matrix given below on the computer.

// TR
// ÖRNEK:
// Aşağıda verilen matrisi, bilgisayarda otomatik olarak oluşturacak bir Java programı yazalım.
//
//        2! 4! 6!
//        8! 10! 12!
//        14! 16! 18!

public class ArrayExamples5 {

    public static void main(String[] args) {

        double[][] array = new double[3][3];
        int i, j, numbers;
        numbers = 2;
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                array[i][j] = factorial(numbers);
                System.out.println(numbers + "!=" + array[i][j]);
                numbers = numbers + 2;
            }
        }
    }

    static double factorial(int n) {
        double fact;
        int i;
        fact = 1.0;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}