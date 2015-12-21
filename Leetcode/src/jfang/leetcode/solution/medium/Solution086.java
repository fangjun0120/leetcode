package jfang.leetcode.solution.medium;

import jfang.leetcode.support.ListNode;

/**
 * Partition List
 * @author jfang
 *
 */
public class Solution086 {

    public ListNode partition(ListNode head, int x) {
        ListNode preLess = new ListNode(0);
        ListNode preGreater = new ListNode(0);
        
        ListNode less = preLess;
        ListNode greater = preGreater;
        ListNode current = head;
        
        while (current != null) {
            if (current.val < x) {
                less.next = current;
                less = current;
                current = current.next;
                less.next = null;
            }
            else {
                greater.next = current;
                greater = current;
                current = current.next;
                greater.next = null;
            }
        }
        
        less.next = preGreater.next;
        preGreater.next = null;
        current = preLess.next;
        preLess.next = null;
        return current;
    }
}
