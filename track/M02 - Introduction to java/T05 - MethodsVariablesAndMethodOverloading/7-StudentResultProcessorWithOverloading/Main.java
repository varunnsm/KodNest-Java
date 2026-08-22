
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        // Create one ResultCalculator object
        ResultCalculator obj = new ResultCalculator();

        // Call both overloaded methods and print both totals
        System.out.println("Two-Mark Total: " + obj.getTotal(first, second));
        System.out.println("Three-Mark Total: " + obj.getTotal(first, second, third));

    }
}
