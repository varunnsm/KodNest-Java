
import java.util.*;

public class CheckWhetherAnArrayIsSorted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (numbers[i] < numbers[i - 1]) {
                sorted = false;
                break;
            }
        }

        System.out.println(sorted ? 1 : 0);
        scanner.close();

    }
}
