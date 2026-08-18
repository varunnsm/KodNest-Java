// Input With Conditions and Loops

import java.util.Scanner;

public class InputWithConditionsAndLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int solvedProblems = 0;
        for (int i = 1; i <= days; i++) {
            int a = scanner.nextInt();
            solvedProblems = solvedProblems + a;
        }
        scanner.close();

        System.out.println("Total solved: " + solvedProblems);
        System.out.print("Status: ");
        if (solvedProblems >= 20) {
            System.out.println("Strong progress");
        } else if (solvedProblems >= 10 && solvedProblems <= 19) {
            System.out.println("Keep improving");
        } else {
            System.out.println("Needs more practice");
        }
    }
}
