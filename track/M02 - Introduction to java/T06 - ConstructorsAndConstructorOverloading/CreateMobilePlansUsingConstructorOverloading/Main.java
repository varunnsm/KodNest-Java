
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the selected plan name and price
        String planName = scanner.nextLine();
        int price = scanner.nextInt();

        // Create the default plan
        MobilePlan obj1 = new MobilePlan();

        // Create the selected plan
        MobilePlan obj2 = new MobilePlan(planName, price);

        // Display both plans
        obj1.display();
        obj2.display();
    }
}
