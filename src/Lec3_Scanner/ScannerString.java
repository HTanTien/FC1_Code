package Lec3_Scanner;
import java.util.Scanner;
public class ScannerString {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a multi-word sentences: ");
        String sentences = keyboard.nextLine();
        System.out.println(sentences);
        System.out.print("Enter a one word string: ");
        String s = keyboard.next();
        System.out.println(s);
    }
}
//Ký tự