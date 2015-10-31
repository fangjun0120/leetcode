package jfang.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

import jfang.leetcode.support.TreeNode;

public class Solution113 {

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root != null) {
            List<Integer> cur = new ArrayList<Integer>();
            helper(root, sum, res, cur);
        }
        return res;
    }
    
    private void helper(TreeNode root, int sum, List<List<Integer>> res, List<Integer> cur) {
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                cur.add(root.val);
                res.add(new ArrayList<Integer>(cur));
                cur.remove(cur.size()-1);
            }
            return;
        }
            
        cur.add(root.val);
        if (root.left != null) 
            helper(root.left, sum-root.val, res, cur);
        if (root.right != null)
            helper(root.right, sum-root.val, res, cur);
        cur.remove(cur.size()-1);
        
        return;
    }
}
