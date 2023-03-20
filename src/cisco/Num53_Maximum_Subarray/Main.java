package cisco.Num53_Maximum_Subarray;

public class Main {
    public static void main(String[] args) {
        int test_subarray[] = {2,-8,3,-2,4,-10};
        int result = maxSubArray(test_subarray);
        System.out.println(result);
    }
    public static int maxSubArray(int[] nums) {
// corner case
        if (nums == null || nums.length == 0) return -1;
// general case
        int[] dp = new int[nums.length];
        int globalMax = nums[0];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
// case 1 if not negative, add
            if (dp[i - 1] >= 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            globalMax = Math.max(globalMax, dp[i]);
        }
        return globalMax;
    }

}
