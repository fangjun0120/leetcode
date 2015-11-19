package jfang.leetcode.solution.easy;

import jfang.leetcode.support.TreeNode;

public class Solution112 {

	public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        return helper(root, sum);
    }
    
    private boolean helper(TreeNode root, int sum) {
        if (root.left == null && root.right == null)
            return sum == root.val;
            
        if (root.left != null && helper(root.left, sum-root.val))
            return true;
            
        if (root.right != null && helper(root.right, sum-root.val))
            return true;
            
        return false;
    }
}
