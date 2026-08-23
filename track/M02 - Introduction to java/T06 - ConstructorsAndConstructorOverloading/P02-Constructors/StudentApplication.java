
public class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Manu");
        s2.display();

        Student s3 = new Student("Raja", 18, 5.5);
        s3.display();
    }
}
