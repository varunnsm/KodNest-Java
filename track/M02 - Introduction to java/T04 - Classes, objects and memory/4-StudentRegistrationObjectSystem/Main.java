
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create and populate firstStudent
        Student s1 = new Student();
        s1.id = sc.nextInt();
        s1.name = sc.next();
        s1.percentage = sc.nextDouble();

        // Create and populate secondStudent
        Student s2 = new Student();
        s2.id = sc.nextInt();
        s2.name = sc.next();
        s2.percentage = sc.nextDouble();

        // Read the selected ID and new attendance
        int selectedId = sc.nextInt();
        double selectedPercentage = sc.nextDouble();
        Student selectedStudent = null;

        // Make selectedStudent refer to the matching existing object
        if (selectedId == s1.id) {
            selectedStudent = s1;
        } else if (selectedId == s2.id) {
            selectedStudent = s2;
        }

        // Update through selectedStudent when a match exists
        if (selectedStudent != null) {
            selectedStudent.percentage = selectedPercentage;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        // Display both records
        System.out.println(s1.id + " - " + s1.name + " - " + s1.percentage + "%");
        System.out.println(s2.id + " - " + s2.name + " - " + s2.percentage + "%");

        sc.close();
    }
}
