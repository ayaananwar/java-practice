package Basic;
//Temperature Conversion Program

public class TempConversion {
    
    public static void main(String arg[]){

    double celsius = 30;
    
    //Fahrenheit = (Celsius × 9/5) + 32
    double fahrenheit = (celsius * (double) 9/5) + 32;
    System.out.println("Celsius: " + celsius);
    System.out.println("Fahrenheit: " + fahrenheit);
    }
}
