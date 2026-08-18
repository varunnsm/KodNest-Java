// Personal Expense Calculator

import java.util.Scanner;

public class PersonalExpenseCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double monthlyIncome = scanner.nextDouble();
        double rentExpense = scanner.nextDouble();
        double foodExpense = scanner.nextDouble();
        double travelExpense = scanner.nextDouble();

        double totalExpense = rentExpense + foodExpense + travelExpense;
        double remainingAmount = monthlyIncome - totalExpense;

        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remainingAmount);

        System.out.print("Status: ");
        if (remainingAmount >= 0) {
            System.out.println("Within budget");
        } else {
            System.out.println("Over budget");
        }
        scanner.close();
    }
}
