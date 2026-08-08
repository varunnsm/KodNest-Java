// Interactive Learner Profile

import java.util.Scanner;

public class P03 {

    public static void main(String[] args) {

        // Read and display the profile
        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        int solvedProblems = sc.nextInt();
        double assessmentPercentage = sc.nextDouble();
        sc.close();

        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + assessmentPercentage);
    }
}
