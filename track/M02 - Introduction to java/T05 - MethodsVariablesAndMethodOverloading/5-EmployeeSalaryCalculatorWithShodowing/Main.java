
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name and salary
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();

        // Create one Employee object
        Employee obj = new Employee();

        // Call setDetails() and displayDetails()
        obj.setDetails(name, salary);
        obj.displayDetails();

    }
}
