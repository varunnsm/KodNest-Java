//Int-Double Conversion and Casting(Complete Java Conversions)

public class IntDoubleConversionAndCasting {

    public static void main(String[] args) {
        int completedProblems = 27;
        double reportValue = completedProblems;

        double exactPercentage = 86.75;
        int wholePercentage = (int) exactPercentage;

        int solvedProblems = 47;
        int practiceDays = 5;
        double average = (double) solvedProblems / practiceDays;

        System.out.println("Report Value:" + reportValue);
        System.out.println("Whole percentage:" + wholePercentage);
        System.out.println("Average:" + average);
    }
}
