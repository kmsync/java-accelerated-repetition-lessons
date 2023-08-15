package basicConcepts;

import java.util.Scanner;

public class ArrayExamples2 {

    public static void main(String[] args) {

//      EN
//      Reading the elements of a two-dimensional array

//      To enter the elements of a two-dimensional array
//      from the keyboard during the execution of a Java programme,
//      we can use a programme like the one below. In the example programme below,
//      the elements of a table named salesTable with 3 rows and 2 columns are entered
//      from the keyboard and then the table is displayed on the screen.
//      Now let's examine this sample programme..

//      TR
//      İki boyutlu dizinin elemanlarını okutmak
//      İki boyutlu dizinin elemanlarını Java programının çalıştırılması sırasında
//      klavyeden girmek için aşağıdaki gibi bir program kullanabiliriz.
//      Aşağıdaki örnek programda 3 satır ve 2 sütunu olan satis adlı tablonun elemanları
//      klavyeden giriliyor ve daha sonra tablo ekrana aktarılıyor.
//      Şimdi bu örnek programı inceleyelim..

        Scanner entry = new Scanner(System.in);

        int[][] salesTable = new int[3][2];
        int i, j;

/*
        EN Let's get the sales table information from the user.
        TR Kullanıcıdan satış tablosu bilgilerini alalım.
*/
        System.out.print("Sales [0,0]=");
        salesTable[0][0] = entry.nextInt();

        System.out.print("Sales [0,1]=");
        salesTable[0][1] = entry.nextInt();

        System.out.print("Sales [1,0]=");
        salesTable[1][0] = entry.nextInt();

        System.out.print("Sales [1,1]=");
        salesTable[1][1] = entry.nextInt();

        System.out.print("Sales [2,0]=");
        salesTable[2][0] = entry.nextInt();

        System.out.print("Sales [2,1]=");
        salesTable[2][1] = entry.nextInt();

/*      EN Printing the sales table elements in the memory to the screen.
        TR Hafızada alınan satış tablosu elemanlarının ekrana yazdırılması.
*/
        System.out.println("Your sales table:");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 1; j++) {
                System.out.print(salesTable[i][j] + " ");
            }
            System.out.println();
        }
    }
}