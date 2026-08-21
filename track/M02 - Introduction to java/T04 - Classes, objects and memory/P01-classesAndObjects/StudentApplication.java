// object

public class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Varun";
        s1.height = 6.0;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();
    }
}
