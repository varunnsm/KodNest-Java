
public class StudentResultReport {

    public static void main(String[] args) {
        // Write your code here.
        int arr[] = {70, 80, 60, 90, 50};

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        System.out.println("Total: " + total);

        double average = total / arr.length;
        System.out.println("Average: " + average);

    }
}
