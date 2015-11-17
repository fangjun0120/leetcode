package jfang.leetcode.solution;

/**
 * Palindrome Number
 * @author jfang
 *
 */
public class Solution009 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        // get highest digit
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }
        
        while (x != 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) { 
                return false;
            }
            // chop off the left and right digit
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}
