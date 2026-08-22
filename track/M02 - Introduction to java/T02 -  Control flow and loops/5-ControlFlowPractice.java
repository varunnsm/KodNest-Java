//Control Flow Practice(Placement Readiness Practice)

public class ControlFlowPractice {

    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        // Write your code here
        String result = (marks >= 60 && attendance >= 75) ? "Placement Ready" : "Continue Prepartion";
        System.out.println(result);

        for (int i = 1; i <= practiceDays; i++) {
            System.out.println("Practice Day: " + i);
        }
    }
}
