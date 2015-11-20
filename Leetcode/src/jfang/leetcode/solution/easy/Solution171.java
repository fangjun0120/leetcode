package jfang.leetcode.solution.easy;

/**
 * Excel Sheet Column Number
 * @author jfang
 *
 */
public class Solution171 {

    public int titleToNumber(String s) {
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int value = c - 'A' + 1;
            sum += value * helper(s.length() - i - 1);
        }
        
        return sum;
    }
    
    private int helper(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= 26;
        }
        return res;
    }
}
