package LEC6_ARRAY_ARRAYLISTEx;
import java.util.Scanner;
public class Ex1_FindtheMaximumandMinimumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many value?: ");
        int n = sc.nextInt();
         int[] arr = new int[n];
        System.out.println("Enter vlue: ");
        for (int i = 0; i < n ; i++){
            System.out.print("Enter value " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
         for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);
    }
}
