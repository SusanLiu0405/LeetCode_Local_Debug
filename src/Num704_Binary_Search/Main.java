package Num704_Binary_Search;
import java.util.*;

public class Main {
    public static void main(String args[]){
        Solution s = new Solution();
        int[] order = {8,8,8,8,8,8};
        int target = 8;
        int result = s.search(order, target);
        System.out.println("mid index= " + result);
    }

}
