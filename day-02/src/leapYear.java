import java.util.Scanner;

// EN
// Multiples of 400 are leap years.
// Multiples of 4 are leap years, but not multiples of 100.
// TR
// 400'ün katları artık yıldır.
// 4'ün katları artık yıldır ancak 100 ün katı olmaması gerekiyor.

public class leapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the year: ");
        int year = scanner.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))

            System.out.println(year + " IS LEAP YEAR. February is 29 days.");
        else
            System.out.println(year + " IS NOT LEAP YEAR.");
    }
}