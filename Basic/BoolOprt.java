package Basic;
public class BoolOprt{

    public static void main(String arg[]){

    int age = 21;
    
    boolean case1 = age >= 18;
    boolean case2 = age < 60;
    boolean case3 = age >= 18 && age <= 60;
    boolean case4 = age == 21;
    boolean case5 = age != 30 ;

    System.out.println("18 or older: " + case1);
    System.out.println("under 60: " + case2);
    System.out.println("between 18 and 60: " + case3);
    System.out.println("exactly 21: " + case4);
    System.out.println("not 30: " + case5);
    }
}