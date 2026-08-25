package com.exercises.solutions.intermediate.p33lowestcommonancestorofbst;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.exercises.common.TreeNode;

public class LowestCommonAncestorOfBSTTest {
    private final LowestCommonAncestorOfBST solution = new LowestCommonAncestorOfBST();

    @Test
    public void testLowestCommonAncestor() {
        TreeNode root = TreeNode.fromLevelOrder(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        TreeNode p = root.left;            // 2
        TreeNode q = root.left.right;      // 4
        assertEquals(2, solution.lowestCommonAncestor(root, p, q).val);

        TreeNode p2 = root.left;  // 2
        TreeNode q2 = root.right; // 8
        assertEquals(6, solution.lowestCommonAncestor(root, p2, q2).val);
    }
}
