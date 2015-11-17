package jfang.leetcode.solution;

import jfang.leetcode.support.ListNode;

/**
 * Add Two Number
 * @author jfang
 *
 */
public class Solution002 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode pre = head;
        ListNode cur = null;
        int carry = 0;
        
        while (!(l1 == null && l2 == null && carry == 0)) {
            int v1 = (l1 != null ? l1.val: 0);
            int v2 = (l2 != null ? l2.val: 0);
            int value = v1 + v2 + carry;
            cur = new ListNode(value % 10);
            carry = value / 10;
            pre.next = cur;
            pre = cur;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        pre = head;
        head = pre.next;
        pre.next = null;
        return head;
    }
}
