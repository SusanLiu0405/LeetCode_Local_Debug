package cisco.Num189_Rotate_Array;

public class Main {
    public static void main(String[] args) {
        int[][] test_matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(rotate(test_matrix));
    }
    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        // corner case
        if (n <= 1) return matrix;
        // general case
        int round = n / 2;
        for (int level = 0; level < round; level++) {
            int left = level;
            int right = n - 2 - level;
            for (int i = left; i <= right; i++) {
                int temp = matrix[left][i];
                matrix[left][i] = matrix[n - 1- i][left];
                matrix[n - 1- i][left] = matrix[n - 1 - left][n - 1 - i];
                matrix[n - 1 - left][n - 1 - i] = matrix[i][n - 1 - left];
                matrix[i][n - 1 - left] = temp;
            }
        }
        return matrix;
    }
}