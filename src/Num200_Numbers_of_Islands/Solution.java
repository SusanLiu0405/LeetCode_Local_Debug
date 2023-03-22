package Num200_Numbers_of_Islands;
import java.util.LinkedList;


public class Solution {
    boolean[][] enqueued;
    int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};     // up, down, right, left
    public void dfs(char[][] grid, int x, int y){
        LinkedList <int[]> stack = new LinkedList<>();
        stack.push(new int[]{x, y});
        enqueued[x][y] = true;
        int row = grid.length;
        int col = grid[0].length;

        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            int m = cur[0];
            int n = cur[1];
            for(int i = 0; i < 4; i++) {      // in all directions
                int next_x = m + move[i][0];
                int next_y = n + move[i][1];
                if(next_x < 0 || next_y == row || next_y < 0 || next_x == col){
                    continue;
                }
                if(!enqueued[next_x][next_y] && grid[next_x][next_y] == '1') {
                    stack.push(new int[]{next_x, next_y});
                }
                enqueued[next_x][next_y] = true;
            }
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;

        // 接下来是第一步，对行列进入遍历
        int row = grid.length;
        int col = grid[0].length;

        boolean[][] enqueued = new boolean[row][col]; // 建立一个访问过的数据维度和输入一样

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                if (enqueued[i][j])
                    // 最后一个要点，在二重循环内部的开始，要判断这个点是否被访问过，
                    // 如果已经访问过，要用 continue 语句跳过。
                    continue;
                if (grid[i][j] =='1')
                {
                    dfs(grid, i, j); //二是DFS或BFS寻找相连的邻接点(小岛)
                    count++; // 三是对小岛计数
                }

            }
        return count;
    }



}

