package com.exercises.solutions.intermediate.p33lowestcommonancestorofbst;

import com.exercises.common.TreeNode;

public class LowestCommonAncestorOfBST {
    // Use the BST ordering: if both p and q are smaller, go left; if both
    // are bigger, go right; otherwise the paths just split here. Time O(h), Space O(1).
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;
        while (current != null) {
            if (p.val < current.val && q.val < current.val) {
                current = current.left;
            } else if (p.val > current.val && q.val > current.val) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }
}
