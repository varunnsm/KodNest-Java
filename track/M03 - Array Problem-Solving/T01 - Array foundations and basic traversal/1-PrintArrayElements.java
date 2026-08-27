
import java.util.Scanner;

public class PrintArrayElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");

        }

        scanner.close();
    }
}
