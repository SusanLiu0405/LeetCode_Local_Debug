package Num133_Clone_Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;

public class Solution {
    public Node cloneGraph(Node node) {
        while (node == null) {
            return node;
        }

        HashMap<Node, Node> visited_map = new HashMap();
        List<Node> queue = new LinkedList<>();
        queue.add(node);
        //  Hash_Map.put(key, value)
        //  The java.util.HashMap.put() method of HashMap is used to insert a mapping into a map.
        //  key: This refers to the key element that needs to be inserted into the Map for mapping.
        //  value: This refers to the value that the above key would map into.
        visited_map.put(node, new Node(node.val, new ArrayList<Node>()));

        while (!queue.isEmpty()) {
            Node current_node = queue.remove(0);   //  队头出队
            //  现在开始遍历current_node里所有的邻居
            for (Node neighbor_i : current_node.neighbors) {
                if (visited_map.containsKey(neighbor_i) == false) {
                    visited_map.put(neighbor_i, new Node(neighbor_i.val, new ArrayList<Node>()));
                    queue.add(neighbor_i);
                }
                visited_map.get(current_node).neighbors.add(visited_map.get(neighbor_i));
            }
        }
        return visited_map.get(node);
    }
}
