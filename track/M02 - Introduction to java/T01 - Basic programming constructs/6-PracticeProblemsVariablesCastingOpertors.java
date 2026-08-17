// Build a Weekly Learning Progress Report (Practice Problems: Variables, casting, opertors)

public class PracticeProblemsVariablesCastingOpertors {

    public static void main(String[] args) {
        int completedTopics = 17;
        int totalTopics = 20;
        int dailyLearningHours = 3;
        int learningDays = 5;

        int remainingTopics = totalTopics - completedTopics;
        int weeklyLearningHours = dailyLearningHours * learningDays;
        double progressPercentage = completedTopics * 100 / totalTopics;

        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + remainingTopics);
        System.out.println("Weekly Learning Hours: " + weeklyLearningHours);
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}
