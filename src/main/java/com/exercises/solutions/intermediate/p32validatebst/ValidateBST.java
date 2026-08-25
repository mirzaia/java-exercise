package com.exercises.solutions.intermediate.p32validatebst;

import com.exercises.common.TreeNode;

public class ValidateBST {
    // Carry a valid (min, max) range down through recursion; every node
    // must fall strictly within the range set by its ancestors. Time O(n), Space O(h).
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer lowerBound, Integer upperBound) {
        if (node == null) return true;
        if (lowerBound != null && node.val <= lowerBound) return false;
        if (upperBound != null && node.val >= upperBound) return false;
        return isValidBST(node.left, lowerBound, node.val) && isValidBST(node.right, node.val, upperBound);
    }
}
