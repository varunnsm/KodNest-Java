// Interactive Learner Progress Summary

import java.util.Scanner;

public class P07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the learner details
        // Calculate and display the progress summary
        String fullName = scanner.nextLine();
        int days = scanner.nextInt();

        int totalSolved = 0;

        for (int i = 1; i <= days; i++) {
            int dailySolved = scanner.nextInt();
            totalSolved = totalSolved + dailySolved;
        }

        double dailyAverage = totalSolved / days;
        scanner.close();

        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + totalSolved);
        System.out.println("Daily average: " + dailyAverage);
        System.out.print("Status: ");

        if (dailyAverage >= 5) {
            System.out.println("Consistent");
        }
    }
}
