package Num125_Valid_Palindrome_inputString;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public boolean isPalindrome(String s) {
        String nstr="";
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            nstr=x+nstr;
        }
        System.out.println(nstr);
        boolean flag=s.equals(nstr);
        return flag;
    }
}