package com.exercises.solutions.basic.p18invertbinarytree;

import com.exercises.common.TreeNode;

public class InvertBinaryTree {
    // Recursively swap left/right at every node. Time O(n), Space O(h) for the call stack.
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
