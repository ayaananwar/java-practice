public class EmployeeSalary {
    
    public static void main(String[] args){
    double monthlySalary = 28000;
    double monthlyBonus = 4500;
    double taxPercentage = 12;
    double monthlyExpense = 18000;
    double savingGoal = 10000;

    double totalIncome = monthlySalary + monthlyBonus;
    double tax = totalIncome * (taxPercentage/100);
    double takeHome = totalIncome - tax;
    double moneyLeft = takeHome - monthlyExpense;
    Boolean achieveGoal = moneyLeft >= savingGoal;
    boolean moneyHome = takeHome > 30000;

    System.out.println("Total Monthly income: " + totalIncome );
    System.out.println("Tax Amount: " + tax);
    System.out.println("Take Home income after tax: " + takeHome);
    System.out.println("Money Left after Expenses: " + moneyLeft);
    System.out.println("Achieved Saving Goal of 10,000rs: " + achieveGoal);
    System.out.println("Take Home income is greater than 30,000: " + moneyHome);
    }
}
