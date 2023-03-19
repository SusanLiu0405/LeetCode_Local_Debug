package cisco.word_puzzle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    private static final int[][] DIRS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public boolean exist(char[][] board, String word) {
// corner case
        if (word == null || word.length() == 0) return false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!visited[i][j] && board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, visited, i, j, 0)) return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, String word, boolean[][] visited,
                        int row, int col, int index) {
// base case
        if (index == word.length()) return true;
// check within bound
        if (row < 0 || row >= board.length || col < 0 || col >=
                board[0].length) return false;
// check visited;
        if (visited[row][col]) return false;
// check match
        if (board[row][col] != word.charAt(index)) return false;
// mark visited
        visited[row][col] = true;
// do dfs
        for (int[] direction : DIRS) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            if(dfs(board, word, visited, newRow, newCol, index + 1)) return
                    true;
        }
// backtracking
        visited[row][col] = false;
        return false;
    }
}