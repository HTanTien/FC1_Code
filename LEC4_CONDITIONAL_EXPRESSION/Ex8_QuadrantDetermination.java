package LEC4_CONDITIONAL_EXPRESSION;
import java.util.Scanner;
public class Ex8_QuadrantDetermination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter y: ");
        double y = sc.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("The point is in the 1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in the 2nd quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in the 3rd quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("The point is in the 4th quadrant");
        } else if (x == 0 && y == 0) {
            System.out.println("The point is at the origin");
        } else {
            System.out.println("The point lies on an axis");
        }
    }
}

