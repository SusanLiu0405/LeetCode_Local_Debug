package Num1584_min_cost_to_connect_all_pts;
import java.util.*;
public class Solution {
    public int minCostConnectPoints(int[][] points) {
        // use an adjacency list to show the graph
        List<int[]>[] graph = buildGraph(points);
        Prim prim = new Prim(graph);
        return prim.minWeightSum_MST;
    }

    public List<int[]>[] buildGraph(int[][] points){
        int point_total = points.length;
        List<int[]>[] graph = new List[point_total];
        for(int i = 0; i < point_total; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < point_total; i++){
            for(int j = i + 1; j < point_total; j++){
                if(i == j){
                    continue;
                }
                int x1 = points[i][0], y1 = points[i][1];
                int x2 = points[j][0], y2 = points[j][1];
                int weight = Math.abs(x1 - x2) + Math.abs(y1 - y2);

                graph[i].add(new int[]{i, j, weight});
                graph[j].add(new int[]{j, i, weight});
            }
        }
        return graph;
    }

    // I use Prim Algorithm
    // MST = Minimum Spanning Tree
    class Prim{
        // Use a priority queue to store the edges
        PriorityQueue<int[]> priority_queue_edges = new PriorityQueue<int[]>((a, b) -> (a[2] - b[2]));
        boolean[] edge_is_in_MST;   // to see whether a node is inside the MST or not
        int minWeightSum_MST = 0;   // to see the current minimum weight of MST
        List<int[]>[] graph;
        // use adjacency list to describe a graph
        // graph[s] includes all the nodes connected to node s
        // an edge is described by using a triplet: int[]{from, to, weight}

        public Prim(List<int[]>[] graph){
            this.graph = graph;
            edge_is_in_MST = new boolean[graph.length];

            // start with points[0]
            cut(0);
            edge_is_in_MST[0] = true;
            while(!priority_queue_edges.isEmpty()){
                int[] edge = priority_queue_edges.poll();
                int to = edge[1];
                int weight = edge[2];
                if(edge_is_in_MST[to]){
                    continue;
                }
                cut(to);
                edge_is_in_MST[to] = true;
                minWeightSum_MST += weight;
            }
        }

        public void cut(int v){
            List<int[]> edges = graph[v];
            for(int[] edge : edges){
                if(edge_is_in_MST[edge[1]]){
                    continue;
                }
                priority_queue_edges.add(edge);
            }
        }
    }
}
