//Scanner String Input

import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Age is " + age);

        System.out.println("Enter your height: ");
        float height = sc.nextInt();
        System.out.println("Height is " + height);
        sc.nextLine();

        System.out.println("Enter your full name: ");
        String name = sc.nextLine();
        System.out.println("Full Name is " + name);

    }
}
