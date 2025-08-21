package LEC4_CONDITIONAL_EXPRESSION;
import java.util.Scanner;
public class Ex10_TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second side: ");
        double b = sc.nextDouble();
        System.out.print("Enter the third side: ");
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("This is an equilateral triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("This is an isosceles triangle.");
            } else {
                System.out.println("This is a scalene triangle.");
            }
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
    }
}

