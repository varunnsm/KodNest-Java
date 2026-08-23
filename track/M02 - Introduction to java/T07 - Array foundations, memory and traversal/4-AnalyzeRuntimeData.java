
import java.util.*;

public class AnalyzeRuntimeData {

    public static void main(String[] args) {
        // Write your code here.
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }
        System.out.println("Total: " + sum);

    }
}
