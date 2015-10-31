package jfang.leetcode.solution;

import jfang.leetcode.support.ListNode;

public class Solution061 {

	public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;
        
        ListNode node = head;
        int n = 1;
        while (node.next != null) {
            n++;
            node = node.next;
        }
        ListNode end = node;
        
        k = k % n;
        n = n - k -1;
        node = head;
        for (int i = 0; i < n; i++) {
            node = node.next;
        }
        end.next = head;
        head = node.next;
        node.next = null;
        
        return head;
    }
}
