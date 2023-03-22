package cisco.Num189_Rotate_Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] test_matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[][] transposed_matrix = rotate(test_matrix);
        for(int i = 0; i < transposed_matrix.length; i++) {
            for (int j = 0; j < transposed_matrix[0].length; j++) {
                System.out.print(transposed_matrix[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    public static int[][] rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        // corner case
        if (col == 0) return matrix;

        // 先做一个转置矩阵
        int[][] new_matrix = new int[col][row];
        for(int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                new_matrix[i][j] = matrix[j][i];
            }
        }

        int[][] reversed_matrix = new int[col][row];
        // 矩阵按照横轴上下翻转
        for(int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                reversed_matrix[i][j] = new_matrix[col - i - 1][j];
            }
        }
        return reversed_matrix;

//        general case
//        int round = n / 2;
//        for (int level = 0; level < round; level++) {
//            int left = level;
//            int right = n - 2 - level;
//            for (int i = left; i <= right; i++) {
//                int temp = matrix[left][i];
//                matrix[left][i] = matrix[n - 1- i][left];
//                matrix[n - 1- i][left] = matrix[n - 1 - left][n - 1 - i];
//                matrix[n - 1 - left][n - 1 - i] = matrix[i][n - 1 - left];
//                matrix[i][n - 1 - left] = temp;
//            }
//        }
    }
}