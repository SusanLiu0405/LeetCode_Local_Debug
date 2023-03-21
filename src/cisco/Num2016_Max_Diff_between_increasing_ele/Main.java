package cisco.Num2016_Max_Diff_between_increasing_ele;

public class Main {
    public static void main(String[] args) {
        int[] test_array = {9,4,3,2};
        System.out.println(maximumDifference(test_array));
    }
    public static int maximumDifference(int[] nums) {
        int diff = -1;
        for (int i = 1, min = nums[0]; i < nums.length; ++i) {
            if (nums[i] > min) {
                diff = Math.max(diff, nums[i] - min);
            }
            min = Math.min(min, nums[i]);
        }
        return diff;
    }

}