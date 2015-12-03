package jfang.leetcode.solution.easy;

import java.util.Stack;

/**
 * Add Binary
 * @author jfang
 *
 */
public class Solution067 {

    public String addBinary(String a, String b) {
        int index_a = a.length()-1;
        int index_b = b.length()-1;
        Stack<Integer> stack = new Stack<Integer>();
        int carry = 0;
        while(index_a >= 0 || index_b >= 0) {
            int int_a = 0;
            int int_b = 0;
            if (index_a >= 0) {
                int_a = a.charAt(index_a) - '0';
                index_a --;
            }
            if (index_b >= 0) {
                int_b = b.charAt(index_b) - '0';
                index_b --;
            }
            int val = int_a + int_b + carry;
            stack.push(val%2);
            carry = val/2;
        }
        if (carry == 1)
            stack.push(carry);
        StringBuilder builder = new StringBuilder();
        while(!stack.isEmpty())
            builder.append(stack.pop());
        return builder.toString();
    }
}
