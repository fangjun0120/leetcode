package jfang.leetcode.solution.easy;

import jfang.leetcode.support.ListNode;

/**
 * Remove Nth Node From End of List
 * @author jfang
 *
 */
public class Solution019 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode back = preHead;
        ListNode front = preHead;
        
        for (int i = 0; i < n; i++) {
            front = front.next;
        }
        while (front.next != null) {
            front = front.next;
            back = back.next;
        }
        front = back.next;
        back.next = front.next;
        front = null;
        
        back = preHead;
        front = back.next;
        preHead.next = null;
        return front;
    }
}
