package jfang.leetcode.solution.medium;

/**
 * Minimum Path Sum
 * @author jfang
 *
 */
public class Solution064 {

    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] cache = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0) {
                    if (j == 0)
                        cache[0] = grid[0][0];
                    else
                        cache[j] = grid[0][j] + cache[j-1];
                }
                else {
                    if (j == 0)
                        cache[0] = cache[0] + grid[i][j];
                    else
                        cache[j] = Math.min(cache[j], cache[j-1]) + grid[i][j];
                }
            }
        }
        return cache[col-1];
    }
}
