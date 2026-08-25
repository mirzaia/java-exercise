package com.exercises.solutions.basic.p19maximumdepthofbinarytree;

import com.exercises.common.TreeNode;

public class MaximumDepthOfBinaryTree {
    // Depth of a tree is 1 + the deeper of its two subtrees. Time O(n), Space O(h).
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
