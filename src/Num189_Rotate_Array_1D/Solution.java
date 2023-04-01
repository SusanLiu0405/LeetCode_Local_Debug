package Num189_Rotate_Array_1D;

class Solution {
    public int[] rotate(int[] nums, int k) {
        while (k > 0) {
            int temp = nums[nums.length-1];
            for (int i = nums.length - 2; i >= 0;i--) {
                nums[i+1] = nums[i];
            }
            nums[0] = temp;
            k--;
        }
        return nums;
    }
}

