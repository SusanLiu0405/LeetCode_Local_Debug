package Num200_Numbers_of_Islands;

public class Main {
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