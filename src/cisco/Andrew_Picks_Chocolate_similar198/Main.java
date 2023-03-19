package cisco.Andrew_Picks_Chocolate_similar198;
import java.util.*;
//  There is a set of N jars containing chocolates. Some of them may be empty.
//  Determine the maximum number of chocolates Andrew can pick from the jars
//        given that he cannot pick jars next to each other
//  Testcase fail: when only 1 input
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }
        int result = rob(nums);
        System.out.println(result);
    }

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;


        if(nums.length == 1){
            return nums[0];
        }

        if (nums.length == 1) return nums[0];
// general case
        int[] dp = new int[nums.length];
// base case
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], dp[0]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[nums.length - 1];

    }
}
