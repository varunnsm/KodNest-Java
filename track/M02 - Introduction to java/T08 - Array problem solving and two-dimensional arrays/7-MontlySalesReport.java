
import java.util.Scanner;

public class MontlySalesReport {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        int matrix[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            int rowTotal = 0;
            for (int j = 0; j < column; j++) {
                rowTotal = rowTotal + matrix[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + rowTotal);
        }
    }
}
