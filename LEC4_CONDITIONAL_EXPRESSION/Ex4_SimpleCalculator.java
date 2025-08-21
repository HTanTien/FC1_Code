package LEC4_CONDITIONAL_EXPRESSION;
import java.util.Scanner;
public class Ex4_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fist number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator (+ - * /): ");
        char operator = sc.next().charAt(0);
        int result;
        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.print(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if ( num2 == 0){
                    System.out.println("Errol:The zero number is not allowed!");
                }else{
                Double divResult = (double) num1 / num2; 
                    System.out.println(num1 + " / " + num2 + " = " + divResult);
                }
                break;
                default:
                System.out.println("Invalid operator!");
        }
    }
}
