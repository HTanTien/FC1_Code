package Lec3_Exercise;
import java.util.Scanner;
public class Excercise7 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a full sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);
        scanner.close();
    }
}
//Sử dụng nextLine để Đọc Đầu vào