
import java.util.Scanner;

public class CountaCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char target = scanner.nextLine().charAt(0);

        int count = 0;

        // Count the target character.
        char arr[] = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);

    }
}
