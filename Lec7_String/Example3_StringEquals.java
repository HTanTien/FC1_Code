package Lec7_String;
public class Example3_StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = new String ("Hello World");
        String s4 = "Hello World1";
        
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
