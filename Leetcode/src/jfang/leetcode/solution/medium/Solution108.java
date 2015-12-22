package jfang.leetcode.solution.medium;

import jfang.leetcode.support.TreeNode;

/**
 * Convert Sorted Array to Binary Search Tree
 * @author jfang
 *
 */
public class Solution108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length-1);
    }
    
    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right)
            return null;
        
        int mid = (left + right) / 2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left = buildTree(nums, left, mid-1);
        head.right = buildTree(nums, mid+1, right);
        return head;
    }
}
