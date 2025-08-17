package Lec3_Exercise;
import java.util.Scanner;
public class Excercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Name: " + name + ", Age: " + age);
        scanner.close();
    }
}
//Bẫy (Pitfall) với nextInt và nextLine