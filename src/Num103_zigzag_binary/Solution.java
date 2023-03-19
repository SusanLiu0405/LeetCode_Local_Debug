package Num103_zigzag_binary;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> output_traversal_result = new ArrayList<List<Integer>>();


        while (root == null) {
            return output_traversal_result;
        }

        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            output_traversal_result.add(new ArrayList<Integer>());
            System.out.println("output_traversal_result"+output_traversal_result);
            int level_length = queue.size();
            System.out.println("Current queue size="+queue.size());
            for(int level_index = 0; level_index < level_length; level_index++){
                System.out.println("Current level_index="+level_index);
                TreeNode parent = queue.removeFirst();
                System.out.println("Current TreeNodeParent="+parent.val);
                if (level %2 == 0) {
                    output_traversal_result.get(level).add(0, parent.val);   // output_traversal_result = [3];
                } else {
                    output_traversal_result.get(level).add(parent.val);   // output_traversal_result = [3];
                }

                System.out.println("Current OutputTraversalResult="+output_traversal_result);
                if (parent.right != null) {
                    queue.add(parent.right); // queue = [3];
                    System.out.println("Added the right children of parent node:"+parent.right.val);
                    System.out.println("Queue:"+queue);
                }
                if (parent.left != null) {
                    queue.add(parent.left);    //queue = [];
                    System.out.println("Added the left children of parent node:"+parent.left.val);
                    System.out.println("Queue:"+queue);
                }

            }
            level++;
            System.out.printf("Ended the traversal of level"+level);
            System.out.println("-------------------------------");
        }
        return output_traversal_result;
    }
}
