package jfang.leetcode.solution.easy;

/**
 * Count and Say
 * Given an integer 1, generate the nth sequence.
 * @author jfang
 *
 */
public class Solution038 {

    public String countAndSay(int n) {
        String number = "1";
        for (int i = 0; i < n-1; i++)
            number = count(number);
        return number;
    }
    
    private String count(String number) {
        StringBuilder buffer = new StringBuilder();
        
        char ch = number.charAt(0);
        int count = 0;
        for (char c: number.toCharArray()) {
            if (c == ch) {
                count++;
            }
            else {
                buffer.append(count);
                buffer.append(ch);
                count = 1;
                ch = c;
            }
        }
        buffer.append(count);
        buffer.append(ch);
        
        return buffer.toString();
    }
}
