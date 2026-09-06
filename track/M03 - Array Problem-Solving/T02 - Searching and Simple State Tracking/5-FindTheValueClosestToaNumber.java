
import java.util.*;

public class FindTheValueClosestToaNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int closest = arr[0];
        int minDiff = Math.abs(arr[0] - target);

        for (int i = 1; i < size; i++) {
            int diff = Math.abs(arr[i] - target);

            if (diff < minDiff || (diff == minDiff && arr[i] < closest)) {
                minDiff = diff;
                closest = arr[i];
            }
        }

        System.out.println(closest);

    }
}
