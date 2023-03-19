package Num344_reverse_string;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public void reverseString(char[] s) {
        char temp;
        for (int i=0;i<s.length/2;i++) {
            temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
        System.out.println(s);
    }
}