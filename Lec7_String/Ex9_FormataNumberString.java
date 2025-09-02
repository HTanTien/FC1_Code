package Lec7_String;
import java.util.Scanner;
public class Ex9_FormataNumberString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number string: ");
        String numberStr = scanner.nextLine();
        StringBuilder sb = new StringBuilder(numberStr);
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, ',');
        }
        System.out.println("Formatted string: " + sb.toString());
        scanner.close();
    }
}