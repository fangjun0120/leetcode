package jfang.leetcode.solution.easy;

import jfang.leetcode.support.ListNode;

import java.util.Stack;

/**
 * Palindrome Linked List
 *
 * Created by jfang on 3/14/2016.
 */
public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode faster = head;
        ListNode slower = head;

        // first half traversal
        while (faster != null && faster.next != null) {
            stack.push(slower.val);
            faster = faster.next.next;
            slower = slower.next;
        }

        // odd number of elements
        if (faster != null)
            slower = slower.next;

        while (slower != null) {
            if (slower.val != stack.pop())
                return false;
            slower = slower.next;
        }
        return true;
    }
}
