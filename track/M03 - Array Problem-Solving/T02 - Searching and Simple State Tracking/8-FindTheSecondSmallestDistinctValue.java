
import java.util.Scanner;

public class FindTheSecondSmallestDistinctValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        long arr[] = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLong();
        }

        long smallest = Long.MAX_VALUE;
        long secondSmallest = Long.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        if (secondSmallest == Long.MAX_VALUE) {
            System.out.println("No second smallest distinct value");
        } else {
            System.out.println(secondSmallest);
        }

        sc.close();
    }
}
