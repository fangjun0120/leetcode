package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Spiral Matrix
 * @author jfang
 *
 */
public class Solution054 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if (matrix.length == 0)
            return result;
        int row = matrix.length;
        int col = matrix[0].length;
        
        for (int i = 0; i < Math.min(row, col)/2; i++) {
            for (int j = i; j < col-i-1; j++)
                result.add(matrix[i][j]);
            for (int j = i; j < row-i-1; j++)
                result.add(matrix[j][col-i-1]);
            for (int j = col-i-1; j > i; j--)
                result.add(matrix[row-i-1][j]);
            for (int j = row-i-1; j > i; j--)
                result.add(matrix[j][i]);
        }
        if (result.size() < row*col) {
            if (row <= col) {
                int i = row/2;
                for (int j = i; j < col-i; j++)
                    result.add(matrix[i][j]);
            }
            else {
                int i = col/2;
                for (int j = i; j < row-i; j++)
                    result.add(matrix[j][i]);
            }
        }
        return result;
    }
}
