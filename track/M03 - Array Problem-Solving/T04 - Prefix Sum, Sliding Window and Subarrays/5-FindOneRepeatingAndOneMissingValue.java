
import java.util.Scanner;

public class FindOneRepeatingAndOneMissingValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int repeating = 0;
        int missing = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    repeating = arr[i];
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                missing = i;
            }
        }

        System.out.println(repeating + " " + missing);
    }
}
