
import java.util.Scanner;

public class BuildAFrequencyReport {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int count = 0;

        for (int i = 0; i < size; i++) {
            if (a[i] == target) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + ": " + count);
    }
}
