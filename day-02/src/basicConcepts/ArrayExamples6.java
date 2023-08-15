package basicConcepts;

//  EN
//  EXAMPLE: Let's write a Java program that finds the smallest and
//  largest element in a 3 by 4 table. Also, let this program find the smallest and
//  largest elements in each row and column.

//  TR
//  ÖRNEK: Önceden belirleyeceğimiz 3'e 4'lük bir tabloda yer alan
//  elemanların en küçük ve en büyük değerdeki elemanı bulan bir Java programı yazalım.
//  Ayrıca bu program her satırdaki ve sütundaki en küçük ve en büyük elemanları da bulabilsin.

public class ArrayExamples6 {

    public static void main(String[] args) {

        double[][] table = new double[][]{
                {34, 11, -7, 53},
                {254, 8, -65, 4},
                {110, 64, 33, 26}
        };
        int i, j;
        double smallElement, bigElement, smallest, biggest;

/*      EN Printing the table
        TR Tablonun yazdırılması
*/
        System.out.println("Elements of Array");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 3; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

/*      EN Finding the largest and smallest elements in each row

        TR Her satırdaki en büyük ve en küçük elemanların bulunması
*/
        for (i = 0; i <= 2; i++) {
            smallElement = 3.4e38;
            bigElement = -3.4e38;
            for (j = 0; j <= 3; j++) {
                if (table[i][j] < smallElement) {
                    smallElement = table[i][j];
                }
                if (table[i][j] > bigElement) {
                    bigElement = table[i][j];
                }
            }
            System.out.println((i + 1) + ". smallest element in the line: " + smallElement);
            System.out.println((i + 1) + ". largest element in the line: " + bigElement);
        }

/*      EN  Find the largest and smallest element in each column.

        TR  Her sütundaki en büyük ve en küçük elemanın bulunması

        EN  In addition, find the largest and smallest element in the table.

        TR  Ek olarak tablodaki en büyük ve en küçük elemanın bulunması
*/
        smallest = 3.4e38;
        biggest = -3.4e38;
        for (j = 0; j <= 3; j++) {
            smallElement = 3.4e38;
            bigElement = -3.4e38;
            for (i = 0; i <= 2; i++) {
                if (table[i][j] < smallElement) {
                    smallElement = table[i][j];
                }
                if (table[i][j] > bigElement) {
                    bigElement = table[i][j];
                }
                if (table[i][j] < smallest) {
                    smallest = table[i][j];
                }
                if (table[i][j] > biggest) {
                    biggest = table[i][j];
                }
            }
            System.out.println((j + 1) + ". smallest element in the column: " + smallElement);
            System.out.println((j + 1) + ". largest element in the column: " + bigElement);
        }
        System.out.println("The smallest element in the table: " + smallest);
        System.out.println("The largest element in the table: " + biggest);
    }
}