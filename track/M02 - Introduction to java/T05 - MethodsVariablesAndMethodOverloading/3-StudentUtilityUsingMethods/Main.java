
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentUtility utility = new StudentUtility();

        // Read input, call methods and display the result
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();

        utility.showReportTitle();
        utility.displayStudent(id, name);

        double passingPercentage = utility.getPassingPercentage();
        double percentage = utility.calculatePercentage(javaScore, sqlScore);
        System.out.println("Percentage: " + percentage);

        System.out.print("Result: ");
        if (passingPercentage <= percentage) {
            System.out.println("PASS");
        } else {
            System.out.println("NEEDS IMPROVEMENT");
        }

        scanner.close();

    }
}
