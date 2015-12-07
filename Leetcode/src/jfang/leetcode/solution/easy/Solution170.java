package jfang.leetcode.solution.easy;

/**
 * Factorial Trailing Zeroes
 * floor(n/5) + floor(n/25) + floor(n/125) + ....
 * @author jfang
 *
 */
public class Solution170 {

    public int trailingZeroes(int n) {
        int s = 0;
        while (n > 1) {
            s += (n/=5);
        }
        return s;
    }
}
