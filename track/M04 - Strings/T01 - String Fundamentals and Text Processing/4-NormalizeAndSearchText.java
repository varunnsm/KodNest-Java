
import java.util.Scanner;

public class NormalizeAndSearchText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();

        // Normalize both values and search for the keyword.
        String normalizedText = sentence.trim().toLowerCase();
        String normalizedKeyword = keyword.trim().toLowerCase();

        boolean containsKeyword = normalizedText.contains(normalizedKeyword);

        System.out.println("Normalized text: " + normalizedText);
        System.out.println("Contains keyword: " + containsKeyword);

    }
}
