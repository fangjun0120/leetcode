package jfang.leetcode.solution.medium;

/**
 * Bitwise AND of Numbers Range
 *
 * Created by jfang on 3/30/2016.
 */
public class Solution201 {
    public int rangeBitwiseAnd(int m, int n) {
        while (n > m)
            n &= (n-1);
        return n;
    }
}
