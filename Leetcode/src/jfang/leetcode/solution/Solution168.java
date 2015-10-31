package jfang.leetcode.solution;

public class Solution168 {

	public String convertToTitle(int n) {
        StringBuilder buffer = new StringBuilder();
        while (n > 0) {
            n--;
            char ch = (char) (n % 26 + 'A');
            n /= 26;
            buffer.append(ch);
        }
        buffer.reverse();
        return buffer.toString();
    }
}
