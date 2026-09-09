
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();

        // Call toUpperCase() without storing the result.
        original.toUpperCase();

        // Create and display an uppercase copy.
        String upperCaseCopy = original.toUpperCase();

        System.out.println("Original: " + original);
        System.out.println("After ignored call: " + original);
        System.out.println("Uppercase copy: " + upperCaseCopy);

    }
}
