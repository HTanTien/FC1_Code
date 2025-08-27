package LEC6_ARRAY_ARRAYLISTEx;
import java.util.*;
public class Ex7_RemoveDuplicates {
    static ArrayList<Integer> removeDup(ArrayList<Integer> list) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int n : list) if (!res.contains(n)) res.add(n);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(removeDup(new ArrayList<>(Arrays.asList(1,3,2,1,4,3,5))));
    }
}
