package Num_266_Palindrome_Permutation_inputString;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public boolean canPermutePalindrome(String s) {
        boolean flag=true;
        int[] alphabet=new int[26];

        for(int i=0;i<s.length();i++){
            alphabet[s.charAt(i)-'a']++;
        }
        int count=0;
        for(int j=0;j<alphabet.length;j++){
            if(alphabet[j]%2!=0){
                if(alphabet[j]==1){
                    count++;
                }
                else{
                    flag=false;
                }
            }
        }
        if(count>=2){
            flag=false;
        }
        return flag;
    }
}