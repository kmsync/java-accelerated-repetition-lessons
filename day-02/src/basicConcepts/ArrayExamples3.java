package basicConcepts;
public class ArrayExamples3 {

    public static void main(String[] args) {

//      EN
//      Initial value assignment to two-dimensional array elements

//      If the elements of the two-dimensional array are fixed,
//      i.e. their values do not change each time the program is run,
//      then we can assign initial values to the elements of
//      the two-dimensional array in the program.
//
//      The initial value assignment may also be necessary to create an initial value
//      for some repetitive operations to be performed on the array,
//      even if the two-dimensional array may change. We can create the elements
//      of the array named satisTable by initial value assignment
//      in the code block as follows..

//      İki boyutlu dizi elemanlarına ilk değer atanması
//
//      İki boyutlu dizinin elemanları sabit olacaksa yani program her çalıştırıldığında
//      değerleri değişmiyorsa, bu durumda iki boyutlu dizi elemanlarına programın içinde
//      ilk değer ataması yapabiliriz.
//
//      İlk değer ataması, iki boyutlu dizi değişebilecek olsa bile,
//      dizi üzerinde gerçekleştirilecek tekrarlı bazı işlemler için de bir başlangıç değeri
//      oluşturmak için gerekli olabilir. satisTablosu adlı dizinin elemanlarını
//      kod bloğu içinde ilk değer ataması yoluyla aşağıdaki gibi oluşturabiliriz..

//        int[][] salesTable2 = new int[][]{
//                {700, 600, 650},
//                {900, 800, 700},
//                {300, 400, 350},
//                {500, 450, 470},
//                {600, 500, 480}
//        };

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

        int[][] salesTable2 = new int[][]{
                {700, 600, 650},
                {900, 800, 700},
                {300, 400, 350},
                {500, 450, 470},
                {600, 500, 480}
        };

        int i, j;

/*      EN Printing the sales table elements in the memory to the screen.
        TR Hafızada alınan satış tablosu elemanlarının ekrana yazdırılması.
*/
        System.out.println("Your sales table:");
        for (i = 0; i <= 4; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(salesTable2[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n**********************\n");

//      EN
//      Using the length function

//      With the length function, it is possible to find the number of elements
//      in each dimension of a two-dimensional array.

//      TR
//      length fonksiyonunun kullanılması

//      length fonksiyonu ile iki boyutlu bir dizinin her bir boyutundaki eleman sayısını
//      bulmak mümkündür.

/*      EN Printing the sales table elements in the memory to the screen.
        TR Hafızada alınan satış tablosu elemanlarının ekrana yazdırılması.
*/
        System.out.println("Your sales table:");

/*      We determine the boundaries of the loops with length() functions.
        Döngülerin sınırlarını length() fonksiyonlarıyla belirliyoruz.
*/
        for (i = 0; i < salesTable2.length; i++) {
            for (j = 0; j < salesTable2[0].length; j++) {
                System.out.print(salesTable2[i][j] + "  ");
            }
            System.out.println();
        }
    }
}