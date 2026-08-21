// Object

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create one Student object
        Student s1 = new Student();

        // Read and store all values in the object
        s1.id = sc.nextInt();
        s1.name = sc.next();
        s1.course = sc.next();
        s1.javaScore = sc.nextDouble();

        // Display the values stored in the object
        s1.profile();

    }

}
