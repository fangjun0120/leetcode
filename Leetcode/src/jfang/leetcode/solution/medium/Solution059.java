package jfang.leetcode.solution.medium;

/**
 * Spiral Matrix II
 * @author jfang
 *
 */
public class Solution059 {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-i-1; j++)
                matrix[i][j] = count++;
            for (int j = i; j < n-i-1; j++)
                matrix[j][n-i-1] = count++;
            for (int j = n-i-1; j > i; j--)
                matrix[n-i-1][j] = count++;
            for (int j = n-i-1; j > i; j--)
                matrix[j][i] = count++;
        }
        if (n%2 == 1)
            matrix[n/2][n/2] = count++;
        return matrix;
    }
}
