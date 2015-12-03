package jfang.leetcode.solution.easy;

import jfang.leetcode.support.TreeNode;

/**
 * Balanced Binary Tree
 * @author jfang
 *
 */
public class Solution110 {

    public boolean isBalanced(TreeNode root) {
        if (depthofNode(root) == -1)
            return false;
        return true;
    }
    
    // return -1 if the subtree is not balanced
    private int depthofNode(TreeNode node) {
        if (node == null)
            return 0;
        int left = depthofNode(node.left);
        if (left == -1)
            return -1;
        int right = depthofNode(node.right);
        if (right == -1)
            return -1;
        if (Math.abs(left - right) > 1)
            return -1;
        return Math.max(left, right) + 1;
    }
}
