
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name and two numbers
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create one object
        MethodDemo obj = new MethodDemo();

        // Call all four methods
        obj.sayHello();
        obj.greet(name);
        System.out.println("Lucky Number: " + obj.getLuckyNumber());
        System.out.println("Sum: " + obj.add(first, second));

    }
}
