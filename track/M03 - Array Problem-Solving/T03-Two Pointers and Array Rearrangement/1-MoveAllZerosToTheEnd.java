
import java.util.*;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr[temp] = arr[i];
                temp++;
            }
        }

        while (temp < size) {
            arr[temp] = 0;
            temp++;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
