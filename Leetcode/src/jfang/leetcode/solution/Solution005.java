package jfang.leetcode.solution;

/**
 * Longest Palindromic Substring
 * @author jfang
 *
 */
public class Solution005 {

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty())
            return null;
        String maxStr = null;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            String palindrome = maxPalindromeString(s, i, i);
            if (palindrome.length() > maxLen) {
                maxLen = palindrome.length();
                maxStr = palindrome;
            }
            palindrome = maxPalindromeString(s, i, i+1);
            if (palindrome.length() > maxLen) {
                maxLen = palindrome.length();
                maxStr = palindrome;
            }
        }
        
        return maxStr;
    }
    
    // find the longest substring with a or two center index
    private String maxPalindromeString(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right))
                return s.substring(left+1, right);
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}
