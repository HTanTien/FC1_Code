package Lec7_String;
import java.util.Scanner;
public class Ex7_CreateanAcronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine();
        String[] words = phrase.trim().split("\\s+");
        StringBuilder acronym = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                acronym.append(word.charAt(0));
            }
        }
        System.out.println("Acronym: " + acronym.toString().toUpperCase());
        scanner.close();
    }
}

