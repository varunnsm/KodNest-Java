
import java.util.*;

class ThreeDimensionalArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[3][3][5];

        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("Array Elements are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
