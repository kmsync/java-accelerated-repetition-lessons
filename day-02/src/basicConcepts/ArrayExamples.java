package basicConcepts;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        // EN Declare an Array. All below ways are legal.
        // TR Bir Dizi tanımlaması bildirmek. Aşağıdaki tüm yöntemler geçerlidir.
        int array[]; // EN Not Readable TR Okunabilir Değil
        int[] runs; // EN Not Readable TR Okunabilir Değil
        int[] temperatures;// EN Recommended TR Tavsiye edilen

        // EN Declaration of an Array should not include size.
        // TR Bir Dizi bildirimi boyut içermemelidir.
        // int values[5];// EN Compilation Error! TR Derleme Hatası!

        // EN Declaring 2D Array Examples
        // TR 2 Boyutlu Dizi Örnekleri Tanımlama
        int[][] matrix1; // EN Recommended TR Tavsiye edilen
        int[] matrix2[]; // EN Legal but not readable. Avoid.
        // TR Geçerli fakat okunabilir değil. Kullanmaktan uzak durun.

        // EN Creating an array TR Dizi oluşturma
        array = new int[5]; // EN 5 is size of array TR 5 dizinin boyutudur.

        // EN Size of an array is mandatory to create an array
        // TR Bir dizi oluşturmak için dizinin boyutu zorunludur
        // marks = new int[];// EN COMPILER ERROR TR DERLEYİCİ HATASI

        // EN Once An Array is created, its size cannot be changed.
        // TR Bir Dizi oluşturulduktan sonra boyutu değiştirilemez.

        // EN Declaring and creating an array in same line
        // TR Aynı satırda bir dizi tanımlamak ve oluşturmak
        int array2[] = new int[5];

        // EN New Arrays are always initialized with default values.
        // TR Yeni Diziler her zaman varsayılan değerlerle başlatılır.
        System.out.println(array2[0]); // 0

        // EN Default Values TR Varsayılan Değerler
        // byte,short,int,long = 0
        // float,double = 0.0
        // boolean = false
        // object = null

        System.out.println("\n**********************\n");

        // EN Assigning values to array TR Diziye değer atamak
        array[0] = 25;
        array[1] = 30;
        array[2] = 50;
        array[3] = 10;
        array[4] = 5;

        // ArrayOnHeap.xls

        // EN Note: Index of an array runs from 0 to length - 1
        // TR Not: Bir dizinin indeks sayısı 0 ile dizi boyutu - 1 ile bulunur.

        // EN Declare, Create and Initialize Array on same line
        // TR Aynı satırda Dizi Tanımlamak, Oluşturmak ve Başlangıç değerlerini girmek
        int array3[] = {25, 30, 50, 10, 5};

        // EN Leaving additional comma is not a problem
        // TR Ek virgül bırakmak sorun değildir.
        int array4[] = {25, 30, 50, 10, 5,};

        // EN Default Values in Array TR Dizide Varsayılan Değerler
        // numbers - 0 floating point - 0.0 Objects - null

        // EN Length of an array: Property length
        // TR Bir dizinin boyutu: Varlık boyutu
        int length = array.length;

        // EN Printing a value from array
        // TR Dizi içerisinden bir değer yazdırmak
        System.out.println(array[2]); // Meaning is 2nd index TR 2. indeks anlamında

        System.out.println("\n**********************\n");

        // EN Looping around an array - Enhanced for loop
        // TR Bir dizi etrafında döngü - Geliştirilmiş for döngüsü
        for (int numbers : array) {
            System.out.println(numbers);
        }

        System.out.println("\n**********************\n");

        // EN Fill arrays with same default value
        // TR Dizileri aynı varsayılan değerle doldurma
        Arrays.fill(array, 100); // EN All array values will be 100
        // TR Tüm dizi değerleri 100 olacaktır

        // EN Access 10th element when array has only length 5
        // TR Dizisinin uzunluğu yalnızca 5 iken 10. elemana erişim
        // Runtime Exception : ArrayIndexOutOfBoundsException
        // EN This is an error type. TR Bu bir hata türüdür.
        // System.out.println(array[10]);

        // EN String Array: similar to int array.
        // TR Dize Dizisi: özellikleri int dizisine benzer.
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};

        // EN Array can contain only values of same type.
        // TR Bir dizi yalnızca aynı türden değerler içerebilir.
        // EN COMPILE ERROR!! TR DERLEME HATASI!!
        // int marks4[] = {10,15.0}; //10 is int 15.0 is float.

        // Cross assigment of primitive arrays is ILLEGAL
        // Basit dizilerin çapraz atanması UYGUN DEĞİLDİR.
        int[] ints = new int[5];
        short[] shorts = new short[5];
        // ints = shorts; // EN COMPILE ERROR!! TR DERLEME HATASI!!
        // ints = (int[])shorts; // EN COMPILE ERROR!! TR DERLEME HATASI!!

        // EN 2D Arrays TR 2 Boyutlu Diziler
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        int[][] matrixA = new int[5][6];

        // EN First dimension is necessary to create a 2D Array
        // TR 2B Dizi oluşturmak için ilk boyut gereklidir.
        // EN Best way to visualize a 2D array is as an array of arrays
        // TR 2B bir diziyi görselleştirmenin en iyi yolu bir dizi dizisidir.
        // ArrayOnHeap.xls
        matrixA = new int[3][]; // FINE
        // matrixA = new int[][5]; // EN COMPILE ERROR!! TR DERLEME HATASI!!
        // matrixA = new int[][]; // EN COMPILE ERROR!! TR DERLEME HATASI!!

        // EN We can create a ragged 2D Array
        // TR Düzensiz bir 2B Dizi oluşturabiliriz
        matrixA[0] = new int[3];
        matrixA[0] = new int[4];
        matrixA[0] = new int[5];

        // EN Above matrix has 2 rows 3 columns.
        // TR Yukarıdaki matris 2 satır 3 sütuna sahiptir.

        // EN Accessing an element from 2D array:
        // TR 2B diziden bir elemana erişme:
        System.out.println(matrix[0][0]); // 1
        System.out.println(matrix[1][2]); // 6

        System.out.println("\n**********************\n");

        // EN Looping a 2D array:
        // TR 2B diziyi döngüye sokma:
        for (int[] marks : matrix) {
            for (int number : array) {
                System.out.println(number);
            }
        }

        System.out.println("\n**********************\n");

        // EN Printing a 1D Array
        // TR 1 Boyutlu Dizi Yazdırma
        int marks5[] = {25, 30, 50, 10, 5};
        System.out.println(marks5); // [I@6db3f829
        System.out.println(Arrays.toString(marks5)); // [25, 30, 50, 10, 5]

        System.out.println("\n**********************\n");

        // EN Printing a 2D Array
        // TR 2 Boyutlu Dizi Yazdırma
        int[][] matrix3 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(matrix3); // [[I@1d5a0305
        System.out.println(Arrays.toString(matrix3));
        // [[I@6db3f829, [I@42698403]
        System.out.println(Arrays.deepToString(matrix3));
        // [[1, 2, 3], [4, 5, 6]]

        System.out.println("\n**********************\n");

        // matrix3[0] is a 1D Array TR 1 boyutlu bir dizidir.
        System.out.println(matrix3[0]);// [I@86c347
        System.out.println(Arrays.toString(matrix3[0]));// [1, 2, 3]

        System.out.println("\n**********************\n");

        // EN Comparing Arrays TR Dizileri Karşılaştırma
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {4, 5, 6};
        System.out.println(Arrays.equals(numbers1, numbers2)); // false
        int[] numbers3 = {1, 2, 3};
        System.out.println(Arrays.equals(numbers1, numbers3)); // true

        System.out.println("\n**********************\n");

        // EN Sorting An Array TR Bir Diziyi Sıralama
        int rollNos[] = {12, 5, 7, 9};
        Arrays.sort(rollNos);
        System.out.println(Arrays.toString(rollNos));// [5, 7, 9, 12]

        System.out.println("\n**********************\n");

        // EN Array of Objects(ArrayOnHeap.xls) TR Nesne Dizileri(ArrayOnHeap.xls)
        Person[] persons = new Person[3];

        // Creating an array of Persons creates TR Kişilerden oluşan bir dizi oluşturma
        // 4 Reference Variables to Person
        // It does not create the Person Objects
        // ArrayOnHeap.xls
        System.out.println(persons[0]); // null

        // EN to assign objects we would need to create them
        // TR nesneleri atamak için onları yaratmamız gerekir
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();

        // EN Other way TR Başka bir yol
        // EN How may objects are created? // 3
        // TR Kaç nesne oluşturulabilir?
        Person[] personsAgain = {new Person(), new Person(), new Person()};

        // EN How may objects are created? // 5
        // TR Kaç nesne oluşturulabilir?
        Person[][] persons2D = {{new Person(), new Person(), new Person()},
                {new Person(), new Person()}};

    }
}

class Person {
    long ssn;
    String name;
}