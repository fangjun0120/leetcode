package jfang.leetcode.solution.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import jfang.leetcode.support.TreeNode;

public class Solution102 {

	public List<List<Integer>>  levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> list = new ArrayList();
        if (root == null)
            return res;
        
        Queue<TreeNode> cur = new LinkedList();
        Queue<TreeNode> next = new LinkedList();
        
        cur.add(root);
        while (cur.size() != 0) {
            TreeNode node = cur.poll();
            list.add(node.val);
            
            if (node.left != null)
                next.add(node.left);
            if (node.right != null)
                next.add(node.right);
                
            if (cur.size() == 0) {
                res.add(list);
                list = new ArrayList();
                cur = next;
                next = new LinkedList();
            }
        }
        
        return res;
    }
}
