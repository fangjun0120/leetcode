package jfang.leetcode.solution.medium;

import jfang.leetcode.support.ListNode;

/**
 * Swap Nodes in Pairs
 * @author jfang
 *
 */
public class Solution024 {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        ListNode front;
        ListNode back;
        
        while (head.next != null && head.next.next != null) {
            front = head.next.next;
            back = head.next;
            back.next = front.next;
            head.next = front;
            front.next = back;
            head = back;
        }
        
        head = dummy.next;
        dummy.next = null;
        return head;
    }
}
