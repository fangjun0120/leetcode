package jfang.leetcode.solution;

import jfang.leetcode.support.ListNode;

public class Solution160 {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        int len = Math.abs(lenA - lenB);
        
        if (lenA > lenB) {
            while (len > 0) {
                headA = headA.next;
                len--;
            }
        }
        else {
            while (len > 0) {
                headB = headB.next;
                len--;
            }
        }   
        
        while (headA != null) {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    
    private int length(ListNode p) {
        int count = 0;
        ListNode tmp = p;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }
}
