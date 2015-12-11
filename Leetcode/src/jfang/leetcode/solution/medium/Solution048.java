package jfang.leetcode.solution.medium;

/**
 * Rotate Image
 * @author jfang
 *
 */
public class Solution048 {

    public void rotate(int[][] matrix) {
        int side = matrix.length;
        for (int layer = 0; layer < side/2; layer++) {
            for (int i = 0; i < side-2*layer-1; i++) {
                int tmp = matrix[layer][layer+i];
                matrix[layer][layer+i] = matrix[side-layer-1-i][layer];
                matrix[side-layer-1-i][layer] = matrix[side-layer-1][side-layer-1-i];
                matrix[side-layer-1][side-layer-1-i] = matrix[layer+i][side-layer-1];
                matrix[layer+i][side-layer-1] = tmp;
            }
        }
    }
}
