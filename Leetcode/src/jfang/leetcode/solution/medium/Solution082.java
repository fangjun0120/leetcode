package jfang.leetcode.solution.medium;

import jfang.leetcode.support.ListNode;

/**
 * Remove Duplicates from Sorted List II
 * @author jfang
 *
 */
public class Solution082 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode pre = dummy;
        ListNode current = head;
        boolean hasDuplicate = false;
        while (current != null && current.next != null) {
            if (hasDuplicate && current.next.val != current.val) {
                pre.next = current.next;
                current.next = null;
                hasDuplicate = false;
                current = pre;
            }
            else if (!hasDuplicate && current.next.val == current.val) {
                hasDuplicate = true;
            }
            else if (!hasDuplicate && current.next.val != current.val) {
                pre = current;
            }
            current = current.next;
        }
        if (hasDuplicate)
            pre.next = null;
        
        head = dummy.next;
        dummy.next = null;
        return head;
    }
}
