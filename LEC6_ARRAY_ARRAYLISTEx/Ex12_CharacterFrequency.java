package LEC6_ARRAY_ARRAYLISTEx;
import java.util.*;
public class Ex12_CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) if (c >= 'a' && c <= 'z') freq[c-'a']++;
        for (int i=0;i<26;i++) if (freq[i]>0) 
            System.out.println((char)(i+'a') + ": " + freq[i]);
    }
}
