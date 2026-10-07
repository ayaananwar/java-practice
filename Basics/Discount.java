
public class Discount {
    
    public static void main(String arg[]){

    double price = 2500;
    double discountPercentage = 15;

    double discountAmount = price * (discountPercentage/100);
    double finalPrice = price - discountAmount;

    System.out.println(discountAmount);
    System.out.println(finalPrice);
    }
}
