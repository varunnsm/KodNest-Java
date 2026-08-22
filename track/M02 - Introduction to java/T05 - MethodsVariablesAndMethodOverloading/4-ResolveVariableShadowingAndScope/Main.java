
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name
        String name = scanner.nextLine();

        // Create one Student object
        Student obj = new Student();

        // Call setName() and displayName()
        obj.setName(name);
        obj.displayName();

    }
}
