package jfang.leetcode.solution.medium;

import jfang.leetcode.support.TreeNode;

/**
 * Construct Binary Tree from Preorder and Inorder Traversal
 * @author jfang
 *
 */
public class Solution105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0)
            return null;
        return buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }
    
    private TreeNode buildTree(int[] preorder, int preLeft, int preRight, 
            int[] inorder, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight)
            return null;
        
        int count = 0;
        while (inorder[inLeft+count] != preorder[preLeft])
            count++;
        
        TreeNode head = new TreeNode(preorder[preLeft]);
        head.left = buildTree(preorder, preLeft+1, preLeft+count, inorder, inLeft, inLeft+count-1);
        head.right = buildTree(preorder, preLeft+count+1, preRight, inorder, inLeft+count+1, inRight);
        
        return head;
    }
}
