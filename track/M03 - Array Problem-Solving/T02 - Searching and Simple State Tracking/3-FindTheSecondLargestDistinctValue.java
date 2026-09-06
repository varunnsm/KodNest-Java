
import java.util.Scanner;

public class FindTheSecondLargestDistinctValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int largest = numbers[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct value");
        } else {
            System.out.println(secondLargest);
        }
    }
}
