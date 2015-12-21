package jfang.leetcode.solution.medium;

import jfang.leetcode.support.ListNode;

/**
 * Reverse Linked List II
 * @author jfang
 *
 */
public class Solution092 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n)
            return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        ListNode pre = null;
        
        for (int i = 0; i < m; i++) {
            pre = current;
            current = current.next;
        }
        ListNode back = current;
        
        ListNode next = null;
        for (int i = 0; i < n-m+1; i++) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        current = pre;
        pre = back.next;
        pre.next = current;
        back.next = next;

        head = dummy.next;
        dummy.next = null;
        return head;
    }
}
