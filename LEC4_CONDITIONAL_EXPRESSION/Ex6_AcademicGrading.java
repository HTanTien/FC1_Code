package LEC4_CONDITIONAL_EXPRESSION;
import java.util.Scanner;
public class Ex6_AcademicGrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter average score (0 - 10): ");
        double score = sc.nextDouble();
        if (score >= 9.0 && score <= 10.0) {
            System.out.println("Excellent");
        } else if (score >= 8.0 && score < 9.0) {
            System.out.println("Good");
        } else if (score >= 6.5 && score < 8.0) {
            System.out.println("Fair");
        } else if (score >= 5.0 && score < 6.5) {
            System.out.println("Average");
        } else if (score >= 0 && score < 5.0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid score! Please enter a value between 0 and 10.");
        }
    }
}

