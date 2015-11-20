package jfang.leetcode.solution.medium;

import jfang.leetcode.support.TreeNode;

/**
 * Lowest Common Ancestor of a Binary Tree
 * @author jfang
 *
 */
public class Solution236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lookForTwoNode(root, p, q).node;
    }

    private ResultInfo lookForTwoNode(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return new ResultInfo();
        
        ResultInfo left = lookForTwoNode(root.left, p, q);
        if (left.node != null)
            return left;
        ResultInfo right = lookForTwoNode(root.right, p, q);
        if (right.node != null)
            return right;
        
        ResultInfo resultInfo = new ResultInfo();
        if (left.hasP || right.hasP || root == p)
            resultInfo.hasP = true;
        if (left.hasQ || right.hasQ || root == q)
            resultInfo.hasQ = true;
        if (resultInfo.hasP && resultInfo.hasQ)
            resultInfo.node = root;
        
        return resultInfo;
    }
    
    private class ResultInfo {
        boolean hasP = false;
        boolean hasQ = false;
        TreeNode node = null;
    }
}
