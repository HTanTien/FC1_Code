package Lec3_Exercise;
import java.util.Scanner;
public class Excercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String w1 = scanner.next();
        String w2 = scanner.next();
        String w3 = scanner.next();
        
        System.out.println("Word 1: " + w1);
        System.out.println("Word 2: " + w2);
        System.out.println("Word 3: " + w3);
        scanner.close();
    }
}
//Nhiều Đầu vào