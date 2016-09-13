package jfang.leetcode.solution.easy;

import jfang.leetcode.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree Paths
 * Created by jfang on 9/13/16.
 */
public class Solution257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        traverse(root, new StringBuilder(), result);
        return result;
    }

    public void traverse(TreeNode node, StringBuilder builder, List<String> result) {
        if (node == null) {
            return;
        }

        builder.append(node.val);
        if (node.left == null && node.right == null) {
            result.add(builder.toString());
            return;
        }
        builder.append("->");
        int len = builder.length();
        if (node.left != null) {
            traverse(node.left, builder, result);
            builder.delete(len, builder.length());
        }
        if (node.right != null) {
            traverse(node.right, builder, result);
            builder.delete(len, builder.length());
        }
    }
}
