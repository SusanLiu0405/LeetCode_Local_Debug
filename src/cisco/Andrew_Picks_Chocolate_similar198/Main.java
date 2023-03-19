package cisco.Andrew_Picks_Chocolate_similar198;

//  There is a set of N jars containing chocolates. Some of them may be empty.
//  Determine the maximum number of chocolates Andrew can pick from the jars
//        given that he cannot pick jars next to each other
//  Testcase fail: when only 1 input
public class Main {
    // Function to calculate the maximum chocolate numbers
    static int maxChocolates(int chocolate_jar[], int n)
    {
        // corner case
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return chocolate_jar[0];
        }

        // if current element is pick then previous cannot
        // be picked
        int pick = chocolate_jar[n] + maxChocolates(chocolate_jar, n - 2);

        // if current element is not picked then previous
        // element is picked
        int notPick = maxChocolates(chocolate_jar, n - 1);

        // return max of picked and not picked
        return Math.max(pick, notPick);
    }

    // test here
    public static void main(String[] args) {
        int chocolate_arr[] = {6, 7, 1, 3, 8, 2, 4};
        int n = chocolate_arr.length;
        System.out.println("Maximum chocolate possible : " + maxChocolates(chocolate_arr, n - 1));
        // Scanner scanner = new.Scaner(System.in);
        // int length = Scanner.nextInt();
        // int[] nums = new int[length];
        // for (int i = 0; i < length; i++) {
        //      nums[i] = scanner.nextInt();
        // }
        // int result = maxChocolate(hval[], hval.length - 1);
        // System.out.println(result);
    }
}
