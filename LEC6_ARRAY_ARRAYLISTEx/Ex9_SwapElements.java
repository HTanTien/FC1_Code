package LEC6_ARRAY_ARRAYLISTEx;
import java.util.*;
public class Ex9_SwapElements {
    static void swap(int[] arr, int i, int j) {
        int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }
}
