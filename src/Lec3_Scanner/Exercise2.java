package Lec3_Scanner;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name: ");
        String sentences = keyboard.nextLine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int number = scanner.nextInt();
        System.out.print("Hello " + sentences);
        System.out.print(" , you are " + number);
        System.out.println(" year old");
        
    }
    
}
