public class ElectricityBill {
    
    public static void main(String arg[]){
    
    int units = 250;
    double pricePerUnit = 6.5;

    /*Total electricity cost
    Add a fixed ₹150 service charge
    Calculate the final bill 

    //Total electricity cost
    double totalCost = (double) units*pricePerUnit;
    System.out.println("Total Electricity Cost: " + totalCost);

    //Add 150rs service charge
    double addcharge = totalCost + 150;
    System.out.println("After 150rs Service Charge: " + addcharge);

    //Final Bill
    double finalBill = addcharge;
    System.out.println("Final Bill: " + finalBill);*/

    //Total Cost
    double totalCost = units*pricePerUnit;
    System.out.println("Total Cost: " + totalCost);

    //Service Charge 150rs
    int serviceCharge = 150;

    //Final Bill
    double finalBill = totalCost + serviceCharge;
    System.out.println("Final Bill: " + finalBill);
    }
}
