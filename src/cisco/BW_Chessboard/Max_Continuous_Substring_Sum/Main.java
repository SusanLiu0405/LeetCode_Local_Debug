package cisco.BW_Chessboard.Max_Continuous_Substring_Sum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public int maxSubArray(int[] nums) {
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