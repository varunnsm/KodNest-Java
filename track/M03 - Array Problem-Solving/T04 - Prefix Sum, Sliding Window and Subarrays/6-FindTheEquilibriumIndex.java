
import java.util.Scanner;

public class FindTheEquilibriumIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        long totalSum = 0;
        for (int i = 0; i < size; i++) {
            totalSum = totalSum + arr[i];
        }

        long leftSum = 0;
        for (int i = 0; i < size; i++) {
            long rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }

            leftSum = leftSum + arr[i];
        }

        System.out.println(-1);
    }
}
