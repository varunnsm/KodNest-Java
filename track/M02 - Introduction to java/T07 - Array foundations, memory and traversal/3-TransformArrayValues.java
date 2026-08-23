
public class TransformArrayValues {

    public static void main(String[] args) {
        // Write your code here.
        int arr[] = {10, 20, 30, 40, 50};
        int bonus = 5;

        System.out.print("Updated values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + bonus;
            System.out.print(arr[i] + " ");
        }
    }
}
