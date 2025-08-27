package LEC6_ARRAY_ARRAYLISTEx;
import java.util.*;
public class Ex8_SortandSearch {
    public static void main(String[] args) {
        int[] arr = {40,20,50,10,30};
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt(), idx = -1;
        for (int i=0;i<arr.length;i++) if (arr[i]==key) idx=i;
        System.out.println("Index = " + idx);
    }
}
