
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Size must be positive");
            return;
        }

        int[] original = new int[size];
        for (int i = 0; i < original.length; i++) {
            original[i] = scanner.nextInt();
        }

        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        ArrayProcessor processor = new ArrayProcessor();
        processor.increaseOddValues(copy);

        System.out.println("Original total: " + processor.calculateTotal(original));
        System.out.println("Changed copy total: " + processor.calculateTotal(copy));

        System.out.println("Changed copy in reverse:");
        for (int i = copy.length - 1; i >= 0; i--) {
            System.out.print(copy[i] + " ");
        }
    }
}
