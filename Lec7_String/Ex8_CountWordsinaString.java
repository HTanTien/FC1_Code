package Lec7_String;
import java.util.Scanner;
public class Ex8_CountWordsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String trimmedInput = input.trim();
        int wordCount;
        if (trimmedInput.isEmpty()) {
            wordCount = 0;
        } else {
            String[] words = trimmedInput.split("\\s+");
            wordCount = words.length;
        }
        System.out.println("Word count: " + wordCount);
        scanner.close();
    }
}

