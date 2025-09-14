package OOP_Nguoi;
import java.util.Scanner;
public class Processer {
    public static void main(String[] args) {
    int continueChoice = 1;
    do {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Who do you want to enter information for? 1 - Student, 2 - Teacher: ");
        int option = Integer.parseInt(scanner.nextLine());

        if (option == 1) {
            Student student = new Student();
            student.input();
            student.evaluateConduct();
            student.output();
        } else if (option == 2) {
            Teacher teacher = new Teacher();
            teacher.Input();
            teacher.Competitionranking();
            teacher.Output();
        } else {
            System.out.println("Invalid choice!");
        }

        System.out.println("\nContinue? 1-Yes, 0-No");
        continueChoice = Integer.parseInt(scanner.nextLine());

    } while (continueChoice != 0);
}

}
