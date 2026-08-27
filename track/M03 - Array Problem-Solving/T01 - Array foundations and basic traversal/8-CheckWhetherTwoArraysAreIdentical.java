
import java.util.*;

public class CheckWhetherTwoArraysAreIdentical {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        int ans = 0;
        if (size1 == size2) {
            for (int i = 0; i < size1; i++) {
                if (arr1[i] == arr2[i]) {
                    ans = 1;
                } else {
                    ans = 0;
                    break;
                }
            }
            System.out.println(ans);
        } else {
            System.out.println(ans);
        }
    }
}
