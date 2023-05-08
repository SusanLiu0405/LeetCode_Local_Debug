package Num59_Spiral_Matrix;

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] outputMatrix = new int[n][n];
        int step = n*n;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        if(outputMatrix.length == 0) {
            return outputMatrix;
        }
        // 右下左上跑，跑完就缩圈，剩余单行列，直接遍历完
        while (top < bottom && left < right) {
            for (int i = left; i <= right; i++) {
                step--;
                outputMatrix[top][i] = n*n - step;
            }

            for (int i = top + 1; i <= bottom; i++) {
                step--;
                outputMatrix[i][right] = n*n - step;
            }

            for (int i = right - 1; i >= left; i--) {
                step--;
                outputMatrix[bottom][i] = n*n - step;
            }
            for (int i = bottom - 1; i >= top + 1; i--) {
                step--;
                outputMatrix[i][left] = n*n - step;
            }
            top++;
            bottom--;
            left++;
            right--;
        }

        if (top == bottom) {
            for (int i = left; i <= right; i++) {
                step--;
                outputMatrix[top][i] = n*n - step;
            }

        } else if (left == right) {
            for (int i = top; i <= bottom; i++) {
                step--;
                outputMatrix[i][right] = n*n - step;
            }
        }
        return outputMatrix;
    }
}
