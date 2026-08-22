
class Employee {

    String name;
    double salary;

    void setDetails(String name, double salary) {
        // Store both parameters in the instance variables
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        // Print the stored name and salary
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
