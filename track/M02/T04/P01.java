// Classes and Objects

class student {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

class P01 {

    public static void main(String[] args) {
        student s1 = new student();
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
