
import java.util.*;

public class ReadAndDisplayaMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j]);
            }

            System.out.println();

        }

    }
}
