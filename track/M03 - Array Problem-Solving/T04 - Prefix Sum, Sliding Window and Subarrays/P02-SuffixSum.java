
import java.util.*;

public class SuffixSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = size - 1; i >= 0; i--) {
            sum = sum + arr[i];
            System.out.print(sum + " ");
        }
    }
}
