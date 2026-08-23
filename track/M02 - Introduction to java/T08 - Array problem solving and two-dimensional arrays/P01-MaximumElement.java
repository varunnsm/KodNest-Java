
import java.util.*;

public class MaximumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Elements are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int max = arr[0];

        for (int i = 0; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("MAX value: " + max);
    }
}
