
import java.util.Scanner;

public class FindTheMissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = sc.nextInt();
        }

        long expectedSum = (long) size * (size + 1) / 2;
        long actualSum = 0;

        for (int i = 0; i < size - 1; i++) {
            actualSum = actualSum + arr[i];
        }

        System.out.println(expectedSum - actualSum);
    }
}
