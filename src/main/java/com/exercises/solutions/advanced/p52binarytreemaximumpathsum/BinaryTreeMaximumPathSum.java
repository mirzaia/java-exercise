package com.exercises.solutions.advanced.p52binarytreemaximumpathsum;

import com.exercises.common.TreeNode;

public class BinaryTreeMaximumPathSum {
    // For each node, the best path THROUGH it uses both children's best
    // downward contributions; track that against a running global best,
    // but only return the single-branch contribution upward (a path can't
    // fork twice). Negative contributions are clamped to 0 (skip that side).
    // Time O(n), Space O(h).
    private int best = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxContribution(root);
        return best;
    }

    private int maxContribution(TreeNode node) {
        if (node == null) return 0;
        int leftContribution = Math.max(maxContribution(node.left), 0);
        int rightContribution = Math.max(maxContribution(node.right), 0);
        best = Math.max(best, node.val + leftContribution + rightContribution);
        return node.val + Math.max(leftContribution, rightContribution);
    }
}
