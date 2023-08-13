import java.util.Scanner;

public class salesPrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter the sale price: ");
//        int endPrice = scanner.nextInt();
//
//        int priceWithoutProfit = (endPrice * 100) / (100 + 25);
//
//        int rawPrice = (priceWithoutProfit * 100) / (100 + 18);
//
//        System.out.println("Raw Price: " + rawPrice);

        //(ham madde fiyatı *118)/100 -> KDV'li fiyat
        //(kdvli fiyat *115)/100 -> Satış fiyatı

        System.out.println("Please enter the raw material price: ");
        double rawPrice = scanner.nextDouble();

        double priceWithoutProfit = (rawPrice * 118) / 100;
        double priceWithProfit = (priceWithoutProfit * 125) / 100;
        System.out.println("Son fiyat: " + priceWithProfit);
    }
}