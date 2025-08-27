package LEC6_ARRAY_ARRAYLISTEx;
import java.util.*;
public class Ex6_UnlimitedInput {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0, n;
        System.out.println("Enter numbers (-1 to stop):");
        while ((n = sc.nextInt()) != -1) { nums.add(n); sum += n; }
        System.out.println("Numbers: " + nums + " , Sum = " + sum);
    }
}
