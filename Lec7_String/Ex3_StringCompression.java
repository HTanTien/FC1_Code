package Lec7_String;
import java.util.Scanner;
public class Ex3_StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to compress: ");
        String input = scanner.nextLine();
        if (input == null || input.isEmpty()) {
            System.out.println("Empty string.");
            return;
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() - 1 || input.charAt(i) != input.charAt(i + 1)) {
                compressed.append(input.charAt(i)).append(count);
                count = 1;
            } else {
                count++;
            }
        }
        System.out.println("Compressed string: " + compressed.toString());
        scanner.close();
    }
}
