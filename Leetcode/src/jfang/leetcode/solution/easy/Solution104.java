package jfang.leetcode.solution.easy;

import jfang.leetcode.support.TreeNode;

/**
 * Maximum Depth of Binary Tree
 * @author jfang
 *
 */
public class Solution104 {

	public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
            
        if (root.left == null && root.right == null)
            return 1;
            
        int left = root.left == null ? Integer.MAX_VALUE : minDepth(root.left);
        int right = root.right == null ? Integer.MAX_VALUE : minDepth(root.right);
        
        return Math.min(left, right)+1;
    }
}
