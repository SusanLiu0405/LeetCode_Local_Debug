package Num189_Rotate_Array_1D;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] test_arr = {1,2,3,4,5,6,7};
        int[] rotated_arr = sol.rotate(test_arr, 3);
        for (int i: rotated_arr) {
            System.out.println(i);
        }
    }
}