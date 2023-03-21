package Num189_Numbers_of_Islands;
import java.util.LinkedList;


class Solution {
    boolean [][]visited;
    int[][] move = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public void dfs(char[][] grid, int y, int x) {
        LinkedList <int[]> stack = new LinkedList<>();
        stack.push(new int[]{y, x});
        visited[y][x] = true;
        while(!stack.isEmpty()) {
            //int[] cur = queue.poll();
            int[] cur = stack.pop();
            int m = cur[0];
            int n = cur[1];
            for(int i = 0; i < 4; i++) {
                int nexty = m + move[i][0];
                int nextx = n + move[i][1];
                if(nextx < 0 || nexty == grid.length || nexty < 0 || nextx == grid[0].length)
                    continue; // 边界检查，新坐标是否在矩阵内。
                if(!visited[nexty][nextx] && grid[nexty][nextx] == '1') {
                    stack.push(new int[]{nexty, nextx});
                }
                visited[nexty][nextx] = true; //只要加入队列就标记为访问
            }
        }
    }

    public void printMatrix() {
        int row = visited.length;
        int col = visited[0].length;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                System.out.print(visited[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int numIslands(char[][] grid) {
        int count = 0;

        // 接下来是第一步，对行列进入遍历
        int row = grid.length;
        int col = grid[0].length;

        visited = new boolean[row][col]; // 建立一个访问过的数据维度和输入一样

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                if (visited[i][j])
                    // 最后一个要点，在二重循环内部的开始，要判断这个点是否被访问过，
                    // 如果已经访问过，要用 continue 语句跳过。
                    continue;
                if (grid[i][j] =='1')
                {
                    dfs(grid, i, j); //二是DFS或BFS寻找相连的邻接点(小岛)
                    count++; // 三是对小岛计数
                    printMatrix();
                    System.out.println("===============");
                }

            }
        return count;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution s = new Solution();
        char[][] matrix = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};
        int count = s.numIslands(matrix);
        System.out.println(count);
    }

}

