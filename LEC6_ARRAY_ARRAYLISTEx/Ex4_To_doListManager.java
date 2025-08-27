package LEC6_ARRAY_ARRAYLISTEx;
import java.util.*;
public class Ex4_To_doListManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        OUTER:
        while (true) {
            System.out.println("1.Add 2.View 3.Remove 4.Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    tasks.add(sc.nextLine());
                    break;
                case 2:
                    System.out.println(tasks);
                    break;
                case 3:
                    tasks.remove(sc.nextInt() - 1);
                    break;
                default:
                    break OUTER;
            }
        }
    }
}