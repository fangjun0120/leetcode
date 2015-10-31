package jfang.leetcode.solution;

import java.util.LinkedList;
import java.util.List;

import jfang.leetcode.support.TreeNode;

public class Solution094 {

	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        helper(root, res);
        return res;
    }
    
    private void helper(TreeNode node, List<Integer> res) {
        if (node == null)
            return;
        helper(node.left, res);
        res.add(node.val);
        helper(node.right, res);
    }
}
