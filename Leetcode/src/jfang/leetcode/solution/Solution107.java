package jfang.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import jfang.leetcode.support.TreeNode;

public class Solution107 {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> list = new ArrayList();
        if (root == null)
            return res;
        
        Stack<List<Integer>> stack = new Stack();
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
                stack.push(list);
                list = new ArrayList();
                cur = next;
                next = new LinkedList();
            }
        }
        
        while (stack.size() != 0)
            res.add(stack.pop());
        
        return res;
    }
}
