
import java.util.*;

public class FindTheSumAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

        double average = (double) sum / size;

        System.out.printf("%.2f", average);

        scanner.close();
    }
}
