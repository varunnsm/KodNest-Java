
import java.util.Scanner;

public class FindTheDifferenceBetweenMaximumAndMinimum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int difference = max - min;
        System.out.println(difference);
    }
}
