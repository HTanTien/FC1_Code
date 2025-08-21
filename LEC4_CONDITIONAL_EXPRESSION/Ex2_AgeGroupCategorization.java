package LEC4_CONDITIONAL_EXPRESSION;
import java.util.Scanner;
public class Ex2_AgeGroupCategorization {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int n = sc.nextInt();
        if(n <= 12){
                System.out.println("This age is Children");
        }else if (n >= 13 && n <= 19){
            System.out.println("This age is Teenager");
        }else if (n >= 20 && n <= 59){
            System.out.println("This age is Adult");
        }else if (n >= 60){
            System.out.println("This age is Senior");
        }
    }
}
