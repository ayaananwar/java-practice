package Basic;
public class SimpleCalculator {
    
    public static void main(String args[]){

        int num1 = 25;
        int num2 = 4;

        int addition = num1 + num2;
        int subtraction = num1 -num2;
        int multiplication = num1*num2;
        double division = (double) num1/num2;
        int reminder = num1%num2;
        int div = num1/num2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("D Division: " + division);
        System.out.println("Reminder" + reminder);
        System.out.println("Normal Divsion: " + div);
    }
}
