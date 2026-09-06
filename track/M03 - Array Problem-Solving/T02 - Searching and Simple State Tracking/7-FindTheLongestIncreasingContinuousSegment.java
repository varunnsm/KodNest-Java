
import java.util.*;

public class FindTheLongestIncreasingContinuousSegment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int prev = sc.nextInt();
        int current = 1;
        int maxLen = 1;

        for (int i = 1; i < size; i++) {
            int x = sc.nextInt();

            if (x > prev) {
                current++;
            } else {
                current = 1;
            }
            maxLen = Math.max(maxLen, current);
            prev = x;
        }

        System.out.println(maxLen);
    }
}
