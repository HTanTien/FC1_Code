package Lec7_String;
import java.util.Scanner;
public class Ex2_CapitalizeaProperName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        String[] words = fullName.trim().split("\\s+"); 
        StringBuilder capitalizedName = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() +
                                         word.substring(1).toLowerCase();
                capitalizedName.append(capitalizedWord).append(" ");
            }
        }
        System.out.println("Normalized name: " + capitalizedName.toString().trim());
    }
}
