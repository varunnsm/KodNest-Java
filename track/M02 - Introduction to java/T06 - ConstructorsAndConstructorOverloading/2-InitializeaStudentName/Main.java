
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Read the full name
        String fname = scanner.nextLine();

// Create one Student object
        Student a = new Student(fname);

// Call display()
        a.display();
    }
}
