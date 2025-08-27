package LEC6_ARRAY_ARRAYLISTEx;
public class Ex11_SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,5,8,20,15,20};
        int max = Integer.MIN_VALUE, sec = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) { sec = max; max = n; }
            else if (n > sec && n < max) sec = n;
        }
        System.out.println("Second largest = " + sec);
    }
}
