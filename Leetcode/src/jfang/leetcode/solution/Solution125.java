package jfang.leetcode.solution;

public class Solution125 {

	public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
            
        s=s.toLowerCase();
        int front = 0;
        int end = s.length()-1;
        while (front < end) {
            while (front < end && !isValid(s.charAt(front)))
                front++;
            while (front < end && !isValid(s.charAt(end)))
                end--;
            if (s.charAt(front) != s.charAt(end))
                return false;
            front++;
            end--;
        }
        return true;
    }
    
    private boolean isValid(char c) {
        return ('a'<=c && c<='z') || ('0'<=c && c<='9');
    }
}
