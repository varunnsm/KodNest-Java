
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read one number and one word
        int number = scanner.nextInt();
        String word = scanner.next();

        // Create one Printer object
        Printer obj = new Printer();

        // Call both show() methods
        obj.show(number);
        obj.show(word);

    }

}
