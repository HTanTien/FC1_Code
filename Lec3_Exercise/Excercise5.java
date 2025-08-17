package Lec3_Exercise;
import java.util.Scanner;
public class Excercise5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter true or false: ");
        boolean value = scanner.nextBoolean();
        System.out.println("You entered: " + value);
        scanner.close();
    }
}
//Đọc Số Boolean