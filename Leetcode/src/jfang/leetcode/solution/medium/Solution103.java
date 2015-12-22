package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import jfang.leetcode.support.TreeNode;

/**
 * Binary Tree Zigzag Level Order Traversal
 * @author jfang
 *
 */
public class Solution103 {
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        Stack<TreeNode> stackToleft = new Stack<TreeNode>();
        Stack<TreeNode> stackToRight = new Stack<TreeNode>();
        if (root != null)
            stackToleft.push(root);
        
        boolean leftToRight = true;
        List<Integer> curList = new ArrayList<Integer>();
        TreeNode current = null;
        while (!stackToleft.isEmpty() || !stackToRight.isEmpty()) {
            if (leftToRight) {
                current = stackToleft.pop();
                curList.add(current.val);
                if (current.left != null)
                    stackToRight.add(current.left);
                if (current.right != null)
                    stackToRight.add(current.right);
                if (stackToleft.isEmpty()) {
                    res.add(curList);
                    curList = new ArrayList<Integer>();
                    leftToRight = false;
                }
            }
            else {
                current = stackToRight.pop();
                curList.add(current.val);
                if (current.right != null)
                    stackToleft.push(current.right);
                if (current.left != null)
                    stackToleft.push(current.left);
                if (stackToRight.isEmpty()) {
                    res.add(curList);
                    curList = new ArrayList<Integer>();
                    leftToRight = true;
                }
            }
        }
        return res;
    }
}
