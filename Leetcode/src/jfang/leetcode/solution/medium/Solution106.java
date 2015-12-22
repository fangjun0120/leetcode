package jfang.leetcode.solution.medium;

import jfang.leetcode.support.TreeNode;

/**
 * Construct Binary Tree from Inorder and Postorder Traversal
 * @author jfang
 *
 */
public class Solution106 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }
    
    private TreeNode buildTree(int[] inorder, int inLeft, int inRight, 
            int[] postorder, int postLeft, int postRight) {
        if (inLeft > inRight || postLeft > postRight)
            return null;
        
        int count = 0;
        while (inorder[inRight-count] != postorder[postRight])
            count++;
        
        TreeNode head = new TreeNode(postorder[postRight]);
        head.left = buildTree(inorder, inLeft, inRight-count-1, postorder, postLeft, postRight-count-1);
        head.right = buildTree(inorder, inRight-count+1, inRight, postorder, postRight-count, postRight-1);
        
        return head;
    }
}
