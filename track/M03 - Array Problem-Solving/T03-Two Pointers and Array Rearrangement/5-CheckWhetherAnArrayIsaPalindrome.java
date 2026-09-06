
import java.util.Scanner;

public class CheckWhetherAnArrayIsaPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = size - 1;
        int palindrome = 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                palindrome = 0;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Palindrome");
    }
}
