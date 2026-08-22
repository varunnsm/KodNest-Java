
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the product name and price
        String fname = scanner.nextLine();
        double fprice = scanner.nextDouble();

        // Create one Product object
        Product a = new Product(fname, fprice);

        // Call display()
        a.display();

    }
}
