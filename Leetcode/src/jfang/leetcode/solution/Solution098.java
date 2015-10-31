package jfang.leetcode.solution;

import jfang.leetcode.support.TreeNode;

public class Solution098 {

	public boolean isValidBST(TreeNode root) {
        return helper(root, (long)Integer.MIN_VALUE-1, (long)Integer.MAX_VALUE+1);
    }
    
    private boolean helper(TreeNode node, long min, long max) {
        if (node == null)
            return true;
            
        if (node.val <= min || node.val >= max)
            return false;
            
        return helper(node.left, min, node.val) && helper(node.right, node.val, max);
    }
}
