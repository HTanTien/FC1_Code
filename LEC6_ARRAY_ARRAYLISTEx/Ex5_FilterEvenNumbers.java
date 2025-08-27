package LEC6_ARRAY_ARRAYLISTEx;
import java.util.*;
public class Ex5_FilterEvenNumbers {
    static ArrayList<Integer> filter(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int n : arr) if (n % 2 == 0) res.add(n);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(filter(new int[]{1,2,3,4,5,6,7,8}));
    }
}
