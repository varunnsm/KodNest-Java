//Find the Maximum Consecutive Ones 

import java.util.Scanner;

public class FindTheMaximumConsecutiveOnes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int current = 0;
        int max = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] == 1) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 0;
            }
        }
        System.out.println(max);
    }
}
