package com.exercises.solutions.basic.p19maximumdepthofbinarytree;

import com.exercises.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaximumDepthOfBinaryTreeTest {
    private final MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    @Test
    public void testMaxDepth() {
        assertEquals(3, solution.maxDepth(TreeNode.fromLevelOrder(new Integer[]{3, 9, 20, null, null, 15, 7})));
        assertEquals(0, solution.maxDepth(null));
        assertEquals(1, solution.maxDepth(new TreeNode(1)));
    }
}
