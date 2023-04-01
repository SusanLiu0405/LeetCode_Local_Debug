package Num27_Remove_Duplicates_From_Sorted_list;

class Solution {
    public int removeDuplicates(int[] nums) {
        while (nums.length == 0) {
            return 0;
        }
        while (nums.length == 1) {
            return nums[0];
        }
        int k = 0;
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i + 1]) {
                k++;
                for(int j = i; j < nums.length - 1; j++) {
                    nums[j+1] = nums[j];
                }
            }
        }
        return k;
    }
}