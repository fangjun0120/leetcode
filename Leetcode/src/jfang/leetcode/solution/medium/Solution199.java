package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import jfang.leetcode.support.TreeNode;

public class Solution199 {

	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList();
        if (root == null)
            return res;
        
        Queue<TreeNode> cur = new LinkedList();
        Queue<TreeNode> next = new LinkedList();
        
        cur.add(root);
        while (cur.size() != 0) {
            TreeNode node = cur.poll();
            
            if (node.left != null)
                next.add(node.left);
            if (node.right != null)
                next.add(node.right);
                
            if (cur.size() == 0) {
                res.add(node.val);
                cur = next;
                next = new LinkedList();
            }
        }
        
        return res;
    }
}
