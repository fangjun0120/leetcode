package jfang.leetcode.solution.easy;

import jfang.leetcode.support.ListNode;

/**
 * Remove Duplicates from Sorted List
 * @author jfang
 *
 */
public class Solution083 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                ListNode tmp = p.next;
                p.next = tmp.next;
                tmp.next = null;
            }
            else 
                p = p.next;
        }
        return head;
    }
}
