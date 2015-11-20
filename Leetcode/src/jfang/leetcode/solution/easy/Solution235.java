package jfang.leetcode.solution.easy;

import jfang.leetcode.support.TreeNode;

/**
 * Lowest Common Ancestor of a Binary Search Tree
 * assume the ancestor will always exist
 * @author jfang
 *
 */
public class Solution235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null)
            return null;
        
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        
        return root;
    }

}
