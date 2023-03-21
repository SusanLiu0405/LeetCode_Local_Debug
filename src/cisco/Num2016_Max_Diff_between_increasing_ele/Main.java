package cisco.Num2016_Max_Diff_between_increasing_ele;

public class Main {
    public static void main(String[] args) {
        int[] test_array = {1,5,2,10};
        System.out.println(maximumDifference(test_array));
    }
    public static int maximumDifference(int[] nums) {
        int diff = -1;
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                diff = Math.max(diff, nums[i] - min);
            }
            min = Math.min(min, nums[i]);
        }
        return diff;
    }

}