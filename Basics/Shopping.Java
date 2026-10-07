//Shopping Checkout
public class Shopping {
     
    public static void main(String args[]){
    double productPrice = 1800;  // Price of Product
    int items = 3;  // Quantity
    double discount = 10;  // Discount Percentage
    double delCharge = 100;  //Delivery Charge
    double budget = 5000;  // Customer Budget

    double subTotal = productPrice * items;
    double disAmount = subTotal * (discount/100);
    double finalBill = subTotal - disAmount + delCharge;
    boolean isWithinBudget = finalBill <= budget;

    System.out.println("Sub Total: " + subTotal);
    System.out.println("Discount Amount: " + disAmount);
    System.out.println("Final Bill: " + finalBill);
    System.out.println("Is within Budget: " + isWithinBudget);
    }
}