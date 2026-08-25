package com.exercises.solutions.intermediate.p32validatebst;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.exercises.common.TreeNode;

public class ValidateBSTTest {
    private final ValidateBST solution = new ValidateBST();

    @Test
    public void testIsValidBST() {
        assertTrue(solution.isValidBST(TreeNode.fromLevelOrder(new Integer[]{2, 1, 3})));
        assertFalse(solution.isValidBST(TreeNode.fromLevelOrder(new Integer[]{5, 1, 4, null, null, 3, 6})));
        assertTrue(solution.isValidBST(new TreeNode(1)));
    }
}
