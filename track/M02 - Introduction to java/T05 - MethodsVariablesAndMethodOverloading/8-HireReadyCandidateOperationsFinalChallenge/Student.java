
class Student {

    String name;

    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void showName() {
        // Print the stored name
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        // Print the first score
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        // Print the total of two scores
        System.out.println("Two-Score Total: " + (first + second));
    }
}
