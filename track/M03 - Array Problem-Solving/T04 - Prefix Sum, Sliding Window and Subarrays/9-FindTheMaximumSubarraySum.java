
import java.util.Scanner;

public class FindTheMaximumSubarraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long sum = 0;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();

            sum = sum + num;

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max);
    }
}
