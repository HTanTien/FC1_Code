package LEC6_ARRAY_ARRAYLISTEx;
import java.util.*;
public class Ex10_ConcatenateArrays {
     static int[] concat(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        System.arraycopy(a,0,res,0,a.length);
        System.arraycopy(b,0,res,a.length,b.length);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(concat(new int[]{1,2,3}, new int[]{4,5,6})));
    }
}
