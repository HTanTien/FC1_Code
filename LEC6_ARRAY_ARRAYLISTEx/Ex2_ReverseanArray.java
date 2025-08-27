package LEC6_ARRAY_ARRAYLISTEx;
 import java.util.*;
public class Ex2_ReverseanArray {
    static void reverse(int[] a){
        for(int i=0;i<a.length/2;i++){ 
            int t=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=t;
        }
    }
    public static void main(String[] args){
        int[] a={11,42,-5,27,0,89};
        reverse(a);
        System.out.println("Reversed: "+Arrays.toString(a));
    }
}

