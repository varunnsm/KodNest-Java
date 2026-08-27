
import java.util.*;

public class CountValuesWithinaGivenRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int min = sc.nextInt();
        int max = sc.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] <= max && arr[i] >= min) {
                count++;
            }
        }
        System.out.println(count);
    }
}
