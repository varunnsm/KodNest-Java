
import java.util.Scanner;

public class AnswerMultipleRangeSumQueries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int sum = 0;
            int left = sc.nextInt();
            int right = sc.nextInt();

            for (int j = left; j <= right; j++) {
                sum = sum + arr[j];
            }
            System.out.println(sum);
        }
    }
}
