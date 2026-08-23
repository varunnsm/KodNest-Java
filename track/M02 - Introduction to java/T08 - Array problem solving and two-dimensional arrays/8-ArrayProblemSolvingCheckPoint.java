
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int arrTotal = 0;
        for (int i = 0; i < size; i++) {
            arrTotal = arrTotal + arr[i];
        }

        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int matrixTotal = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixTotal += matrix[i][j];
            }
        }

        System.out.println("Array total: " + arrTotal);
        System.out.println("Matrix total: " + matrixTotal);
    }
}
