
import java.util.*;

public class CinemaSeatAnalyzer {

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

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    count++;
                }
            }
        }

        System.out.println("Available seats: " + count);
    }
}
