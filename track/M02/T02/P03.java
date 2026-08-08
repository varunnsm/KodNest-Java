// Placement Eligibility Checker

public class P03 {

    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean projectCompleted = true;

        boolean markEligible = marks >= 60;
        boolean attendanceEligible = attendance >= 75;
        boolean academicEligible = markEligible && attendanceEligible;
        boolean placementEligible = academicEligible && projectCompleted;
        System.out.println("Placement Eligible: " + placementEligible);
    }
}
