package jfang.leetcode.solution.medium;

/**
 * Unique Binary Search Trees
 * @author jfang
 *
 * count[i]: the number of BSTs with i element nodes
 */
public class Solution096 {
    
    public int numTrees(int n) {
        int[] count = new int[n+1];
        count[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            count[i] = 0;
            for (int j = 0; j < i; j++) {
                count[i] += count[j] * count[i-j-1];
            }
        }
        return count[n];
    }
}
