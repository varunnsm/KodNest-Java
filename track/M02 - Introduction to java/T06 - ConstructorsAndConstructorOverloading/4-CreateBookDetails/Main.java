
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the book title and author
        String ftitle = scanner.nextLine();
        String fauthor = scanner.nextLine();

        // Create one Book object
        Book a = new Book(ftitle, fauthor);

        // Call display()
        a.display();

    }

}
