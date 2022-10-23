import java.util.Scanner;

public class WeightedAverage {
    public static void main(String[] args) {
        System.out.println("The weighted average score is " + calculateWeightedAverage());

    }
    static float calculateWeightedAverage(){
        float assignmentWeight = 10f;
        float projectWeight = 35f;
        float quizWeight = 10f;
        float midTermWeight = 15f;
        float finalExamWeight = 30f;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the assignment score : ");
        float assignmentScore = scanner.nextInt();
        System.out.print("Enter the project score : ");
        float projectScore = scanner.nextInt();
        System.out.print("Enter the quiz score : ");
        float quizScore = scanner.nextInt();
        System.out.print("Enter the mid term score : ");
        float midTermScore = scanner.nextInt();
        System.out.print("Enter the final exam score : ");
        float finalExamScore = scanner.nextInt();

        float assignmentPercentageScore = (assignmentWeight/100.0f ) * assignmentScore;
        float projectPercentageScore = (projectWeight/100.0f ) * projectScore;
        float quizPercentageScore = (quizWeight/100.0f ) * quizScore;
        float midTermPercentageScore = (midTermWeight/100.0f ) * midTermScore;
        float finalExamPercentageScore = (finalExamWeight/100.0f ) * finalExamScore;
        System.out.println("Weights \t % Value of score");
        System.out.println("Assignments  " + assignmentPercentageScore);
        System.out.println("Projects \t " + projectPercentageScore);
        System.out.println("Quizzes \t " + quizPercentageScore);
        System.out.println("Mid term \t " + midTermPercentageScore);
        System.out.println("Final Exam \t " + finalExamPercentageScore);

        float overallPercentage = assignmentPercentageScore + projectPercentageScore + quizPercentageScore +midTermPercentageScore + finalExamPercentageScore;
        return overallPercentage;
    }
}
