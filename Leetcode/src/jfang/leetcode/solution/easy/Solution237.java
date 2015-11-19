package jfang.leetcode.solution.easy;

import jfang.leetcode.support.ListNode;

/**
 * Delete Node in a Linked List
 * @author jfang
 *
 */
public class Solution237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
