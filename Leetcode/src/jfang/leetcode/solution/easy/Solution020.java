package jfang.leetcode.solution.easy;

import java.util.Stack;

/**
 * Valid Parentheses
 * @author jfang
 *
 */
public class Solution020 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            }
            if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            }
            if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
