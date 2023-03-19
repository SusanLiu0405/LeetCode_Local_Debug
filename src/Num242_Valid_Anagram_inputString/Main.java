package Num242_Valid_Anagram_inputString;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public boolean isAnagram(String s, String t) {
        int[] alphabet=new int[26];//其实新建的时候就是所有元素为0的array

        if(s.length()!=t.length()){
            return false;
        }

        for(int i = 0;i < s.length();i++){
            alphabet[s.charAt(i)-'a']++;
        }

        for(int i=0;i < t.length();i++){
            alphabet[t.charAt(i)-'a']--;
        }

        for (int j=0;j<alphabet.length;j++){
            if(alphabet[j]!=0){
                return false;
            }
        }
        return true;
    }
}