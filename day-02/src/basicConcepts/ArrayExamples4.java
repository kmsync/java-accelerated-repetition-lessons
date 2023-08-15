package basicConcepts;

//      EN Automobile Sales in 1998
//      TR 1998 Yılı Otomobil Satışları
//
//      EN (Note: Figures are given for example purposes.)
//      TR (Not: Rakamlar örnek amaçlı verilmiştir.)
//
//      EN  BRAND   JANUARY FEBRUARY MARCH
//      TR  MARKA    OCAK    ŞUBAT   MART
//          Fiat	 700	  600 	 650
//          Renault	 900	  800	 700
//          VW	     300	  400	 350
//          Opel	 500	  450	 470
//          Ford	 600	  500	 480

public class ArrayExamples4 {

//    EN
//    EXAMPLE:
//    Finding the Row and Column Totals of the Sales Table and the Grand Total of
//    the Elements in the Table

//    TR
//    ÖRNEK:
//    Satış Tablosunun Satır ve Sütun Toplamlarının ve Tablodaki Elemanların
//    Genel Toplamının Bulunması

    public static void main(String[] args) {

        System.out.println("\n**********************\n");

        int[][] salesTable = new int[][]{
                {700, 600, 650},
                {900, 800, 700},
                {300, 400, 350},
                {500, 450, 470},
                {600, 500, 480}
        };
        int i, j, totalSales, totalNumberofCar = 0;

/*      EN Printing the sales table elements in the memory to the screen.
        TR Hafızada alınan satış tablosu elemanlarının ekrana yazdırılması.
*/
        System.out.println("Table of car sales\n");
        for (i = 0; i < salesTable.length; i++) {
            for (j = 0; j < salesTable[0].length; j++) {
                System.out.print(salesTable[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n**********************\n");

/*      EN
        Let's print the 3-month sales totals for each brand,
        that is, the row totals of the array.

        TR
        Her marka için 3 aylık satış toplamlarını,
        yani dizinin satır toplamlarını yazdıralım.
*/
        for (i = 0; i <= 4; i++) {
            totalSales = 0;
            for (j = 0; j <= 2; j++)
                totalSales = totalSales + salesTable[i][j];
            System.out.println(i + 1 + ". total sales of the brand: " + totalSales);
        }

        System.out.println("\n**********************\n");

/*      EN
        Let's show the sales totals of 5 brands for each month,
        that is, the totals of the columns in the table.

        TR
        Her ay için 5 markanın satış toplamlarını,
        yani tablodaki sütunların toplamlarını gösterelim.
*/
        System.out.println();
        totalNumberofCar = 0;
        for (j = 0; j <= 2; j++) {
            totalSales = 0;
            for (i = 0; i <= 4; i++) {
                totalSales = totalSales + salesTable[i][j];
                totalNumberofCar = totalNumberofCar + salesTable[i][j];
            }
            System.out.println(j + 1 + ". total sales for 5 brands per month: " + totalSales);
        }

        System.out.println("\n**********************\n");

/*      EN
        3-MONTH TOTAL CAR SALES-OVERALL

        TR
        3 AY ICIN TOPLAM OTOMOBIL SATISI-GENEL TOPLAM
*/
        System.out.println("3-month total car sales: " + totalNumberofCar);
    }
}