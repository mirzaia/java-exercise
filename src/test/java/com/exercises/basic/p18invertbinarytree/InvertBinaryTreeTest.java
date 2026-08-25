package com.exercises.basic.p18invertbinarytree;

import com.exercises.common.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvertBinaryTreeTest {
    private final InvertBinaryTree solution = new InvertBinaryTree();

    @Test
    public void testInvertTree() {
        TreeNode root = TreeNode.fromLevelOrder(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        TreeNode inverted = solution.invertTree(root);
        assertEquals(4, inverted.val);
        assertEquals(7, inverted.left.val);
        assertEquals(2, inverted.right.val);
        assertEquals(9, inverted.left.left.val);
        assertEquals(6, inverted.left.right.val);
        assertEquals(3, inverted.right.left.val);
        assertEquals(1, inverted.right.right.val);

        assertNull(solution.invertTree(null));
    }
}
