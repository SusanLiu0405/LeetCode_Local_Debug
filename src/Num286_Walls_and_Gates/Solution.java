package Num286_Walls_and_Gates;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public void wallsAndGates(int[][] rooms) {
        if (rooms == null || rooms.length == 0 || rooms[0].length == 0) {
            return;
        }
        LinkedList<int[]> queue = new LinkedList<>();

        // add all the gates into the queue
        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++){
                if(rooms[i][j] == 0) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] curr = queue.pop();
                int curr_row = curr[0];
                int curr_col = curr[1];
                for (int[] next: getNexts(curr_row, curr_col, rooms)) {
                    int next_row = next[0];
                    int next_col = next[1];
                    if(rooms[next_row][next_col] > rooms[curr_row][curr_col] + 1){
                        rooms[next_row][next_col] = rooms[curr_row][curr_col] + 1;
                        queue.add(new int[]{next_row, next_col});
                    }
                }
            }
        }
    }
    private List<int[]> getNexts(int row, int col, int[][] rooms) {
        List<int[]> nexts = new ArrayList<>();
        int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};
        for (int i = 0; i < 4; i++) {
            int next_row = row + move[i][0];
            int next_col = col + move[i][1];
            if (inBound(next_row, next_col, rooms) && rooms[next_row][next_col] != -1 && rooms[next_row][next_col] != 0) {
                nexts.add(new int[]{next_row, next_col});
            }
        }
        return nexts;
    }

    private boolean inBound(int row, int col, int[][] rooms) {
        return 0 <= row && row < rooms.length && 0 <= col && col < rooms[0].length;
    }
}
