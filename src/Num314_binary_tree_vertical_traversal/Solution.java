package Num314_binary_tree_vertical_traversal;
import java.util.*;

public class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        LinkedList<HashMap<TreeNode, Integer>> queue =new LinkedList<>();
        List<List<Integer>> output_traversal_result = new ArrayList<List<Integer>>();

        //先看是不是空的树
        while (root == null) {
            return output_traversal_result;
        }
        return output_traversal_result;
    }
}
