package jfang.leetcode.solution.easy;

import jfang.leetcode.support.TreeNode;

/**
 * Invert Binary Tree
 * @author jfang
 *
 */
public class Solution226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
