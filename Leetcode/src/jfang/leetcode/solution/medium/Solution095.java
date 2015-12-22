package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.List;

import jfang.leetcode.support.TreeNode;

/**
 * Unique Binary Search Trees II
 * @author jfang
 *
 */
public class Solution095 {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0)
            return new ArrayList<TreeNode>();
        return generateTrees(1, n);
    }
    
    private List<TreeNode> generateTrees(int left, int right) {
        List<TreeNode> headList = new ArrayList<TreeNode>();
        if (left > right) {
            headList.add(null);
            return headList;
        }
        
        for (int i = left; i <= right; i++) {
            for (TreeNode subLeft: generateTrees(left, i-1)) 
                for (TreeNode subRight: generateTrees(i+1, right)) {
                    TreeNode head = new TreeNode(i);
                    head.left = subLeft;
                    head.right = subRight;
                    headList.add(head);
                }
        }
        return headList;
    }
}
