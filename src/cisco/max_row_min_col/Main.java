package cisco.max_row_min_col;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] test_matrix = {{1}};
        System.out.println(minmaxNumbers(test_matrix));
    }
    public static int minmaxNumbers(int[][] matrix) {
        // Initialize unordered set
        Set<Integer> maxInEachRow= new HashSet<>();
        // Traverse the matrix
        for(int i = 0; i < matrix.length; i++) {
            int maxInRow = Integer.MIN_VALUE;
            for(int j = 0; j < matrix[i].length; j++) {
                // Update the max
                // element of current row
                maxInRow = Math.max(maxInRow, matrix[i][j]);
            }
            // Insert the minimum
            // element of the row
            maxInEachRow.add(maxInRow);
        }
        // find the min in each col
        for(int j = 0; j < matrix[0].length; j++) {
            int minInCol = Integer.MAX_VALUE;
            for(int i = 0; i < matrix.length; i++) {
                // Update the maximum
                // element of current column
                minInCol = Math.min(minInCol,
                        matrix[i][j]);
            }
            // Checking if it is already present
            // in the unordered_set or not
            if (maxInEachRow.contains(minInCol)){
                return minInCol;
            }
        }
        return -1;
    }

}