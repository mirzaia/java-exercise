package com.exercises.solutions.advanced.p52binarytreemaximumpathsum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.exercises.common.TreeNode;

public class BinaryTreeMaximumPathSumTest {
    private final BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    @Test
    public void testMaxPathSum() {
        assertEquals(6, solution.maxPathSum(TreeNode.fromLevelOrder(new Integer[]{1, 2, 3})));
        assertEquals(42, solution.maxPathSum(TreeNode.fromLevelOrder(new Integer[]{-10, 9, 20, null, null, 15, 7})));
    }
}
