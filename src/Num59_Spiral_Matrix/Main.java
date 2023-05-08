package Num59_Spiral_Matrix;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Solution sol = new Solution();
        int testmatrix[][] = sol.generateMatrix(n);
        for(int i = 0; i < n; i ++){
            for (int j = 0; j < n; j++) {
                System.out.print(testmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}