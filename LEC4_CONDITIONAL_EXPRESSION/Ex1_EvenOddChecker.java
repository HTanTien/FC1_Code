package LEC4_CONDITIONAL_EXPRESSION;
import java.util.Scanner;
public class Ex1_EvenOddChecker {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n % 2 ==0){
            System.out.println(n + " even number");
        }
        else {
            System.out.println(n + " odd number");
        }
    }
}
