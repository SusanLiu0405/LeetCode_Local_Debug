package Num102_levelOrder;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode tn7 = new TreeNode(7);
        TreeNode tn15 = new TreeNode(15);
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn20 = new TreeNode(20, tn15, tn7);
        TreeNode tn9 = new TreeNode(9, tn1, tn2);
        TreeNode tn3 = new TreeNode(3, tn9, tn20);


        List<List<Integer>> zigzag_result = s.levelOrder(tn3);

        for(List<Integer> i : zigzag_result){
            System.out.println(i);
        }
    }
}



