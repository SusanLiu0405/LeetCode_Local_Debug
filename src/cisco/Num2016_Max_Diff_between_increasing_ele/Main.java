package cisco.Num2016_Max_Diff_between_increasing_ele;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public int maximumDifference(int[] nums) {
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