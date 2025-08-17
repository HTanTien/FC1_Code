package Lec3_Exercise;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter num1= ");
    double num1 = keyboard.nextDouble();
    System.out.print("Enter num2= ");
    double num2 = keyboard.nextDouble();
    System.out.println("Average= " + (num1 + num2 ) / 2);
    }
}
//Đọc Số đôi bằng Scanner