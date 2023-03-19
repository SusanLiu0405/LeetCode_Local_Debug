package cisco.Skip_Cells;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] test_matrix = {{29, 8, 37},{15, 41, 3},{1, 10, 14}};
        List path = spiralOrder(test_matrix);
        System.out.println(path.get(path.size()-1));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        // recursive traversal
        List<Integer> list = new ArrayList<>();

        int m = matrix.length;
        // corner case
        if (m == 0) return list;
        int n = matrix[0].length;
        // general case
        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = m - 1;
        while (left < right && up < down) {
            for (int i = up; i <= down ; i++) {// left from top to bottom
                list.add(matrix[i][left]);
            }
            for (int i = left + 1; i <= right - 1; i++) {// bottom from left to right offset by one
                list.add(matrix[down][i]);
            }
            for (int i = down; i >= up; i--) {// right from up to down
                list.add(matrix[i][right]);
            }
            for (int i = right - 1; i >= left + 1; i--) { // top from right to left
                list.add(matrix[up][i]);
            }
            left++;
            right--;
            up++;
            down--;
        }
        // if there is nothing left
        if (left > right || up > down) {
            List<Integer> result = skipByOne(list);
            return result;
        }
        // if there is one column left;
        if (left == right) {
            for (int i = up; i <= down; i++) {
                list.add(matrix[i][left]);
            }
        } else {
            // if there is one row left;
            for (int i = left; i <= right; i++) {
                list.add(matrix[up][i]);
            }
        }
        List<Integer> result = skipByOne(list);
        return result;
    }
    private static List<Integer> skipByOne(List<Integer> input) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.size(); i += 2) {
            result.add(input.get(i));
        }
        return result;
    }
}