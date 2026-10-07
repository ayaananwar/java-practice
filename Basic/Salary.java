public class Salary {
    
    public static void main(String arg[]){

    double monthlySalary = 22000;
    double monthlyBonus = 3000;
    
    System.out.println("Monthly Salary: " + monthlySalary);
    System.out.println("Monthly Bonus: " + monthlyBonus);
  
    //Total monthly income 
    double mothlyIncome = monthlySalary + monthlyBonus;
    System.out.println("Total montly income: " + mothlyIncome);

    //Yearly Salary without bonus
    double salaryNoBonus = monthlySalary * 12 ;
    System.out.println("Yearly Salary without bonus: " + salaryNoBonus);

    //Yearly income including bonus 
    double incomeWithBonus = mothlyIncome * 12;
    System.out.println("Yearly income including bonus: " + incomeWithBonus);

    }
}
