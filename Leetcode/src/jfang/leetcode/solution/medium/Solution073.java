package jfang.leetcode.solution.medium;

/**
 * Set Matrix Zeroes
 * @author jfang
 *
 */
public class Solution073 {

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] rowFlag = new boolean[row];
        boolean[] colFlag = new boolean[col];
        
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                if (rowFlag[i] || colFlag[j])
                    matrix[i][j] = 0;
            }
    }
}
