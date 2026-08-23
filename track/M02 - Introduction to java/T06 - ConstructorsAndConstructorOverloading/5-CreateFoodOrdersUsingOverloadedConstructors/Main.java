
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the item and quantity
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        // Create one order with the first constructor
        FoodOrder obj1 = new FoodOrder(item);

        // Create one order with the second constructor
        FoodOrder obj2 = new FoodOrder(item, quantity);

        // Display both orders
        obj1.display();
        obj2.display();

    }
}
