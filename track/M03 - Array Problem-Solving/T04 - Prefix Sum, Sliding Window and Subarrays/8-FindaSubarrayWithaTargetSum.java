
import java.util.Scanner;

public class FindaSubarrayWithaTargetSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum = sum + arr[right];

            while (sum > target && left <= right) {
                sum = sum - arr[left];
                left++;
            }

            if (sum == target && left <= right) {
                System.out.println(left + " " + right);
                return;
            }
        }
        System.out.println(-1);
    }
}
