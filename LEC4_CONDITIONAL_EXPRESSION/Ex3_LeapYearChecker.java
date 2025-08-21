package LEC4_CONDITIONAL_EXPRESSION;
import java.util.Scanner;
public class Ex3_LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("The year " + year + "is a leap year");
        }else {
            System.out.println("The year " + year + "is not a leap year");
        }
    }
}
