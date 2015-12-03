package jfang.leetcode.solution.easy;

import jfang.leetcode.support.TreeNode;

/**
 * Minimum Depth of Binary Tree
 * @author jfang
 *
 */
public class Solution111 {

    public int minDepth(TreeNode root) {
        if (root == null) 
            return 0;
        else if (root.left != null && root.right != null) 
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        else 
            return 1 + minDepth(root.right) + minDepth(root.left);
    }
}
