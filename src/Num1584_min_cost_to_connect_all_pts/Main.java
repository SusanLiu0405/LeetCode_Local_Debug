package Num1584_min_cost_to_connect_all_pts;

public class Main {
    public static void main(String[] args){
        int[][] points = {{0,0},{2,2},{3,10},{5,2},{7,0}};
        Solution F= new Solution();
        int result = F.minCostConnectPoints(points);
        System.out.println(result);
    }
}
