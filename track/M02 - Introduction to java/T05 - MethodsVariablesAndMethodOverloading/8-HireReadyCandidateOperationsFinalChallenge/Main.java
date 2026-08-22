
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name and two scores
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create one Student object
        Student obj = new Student();

        // Store and print the name
        obj.setName(name);
        obj.showName();

        // Call both showScore() methods
        obj.showScore(first);
        obj.showScore(first, second);

    }
}
