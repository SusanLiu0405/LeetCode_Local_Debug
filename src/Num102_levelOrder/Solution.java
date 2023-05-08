package Num102_levelOrder; /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> output_traversal_result = new ArrayList<List<Integer>>();

        while(root == null) {
            return output_traversal_result;
        }
        queue.add(root);
        while(!queue.isEmpty()) {
            output_traversal_result.add(new ArrayList<Integer>());
            int level_length = queue.size();

            //traverse current level
            for(int level_index = 0; level_index < level_length; level_index++) {
                TreeNode parent = queue.poll();
                if (parent.right != null) {
                    queue.offer(parent.right);
                }
                if (parent.left != null) {
                    queue.offer(parent.left);
                }
            }
        }
        return output_traversal_result;
    }
}