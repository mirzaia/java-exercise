package com.exercises;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeLevelOrderTest {
    private final BinaryTreeLevelOrder solution = new BinaryTreeLevelOrder();

    @Test
    public void testLevelOrder() {
        // [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(3),
            Arrays.asList(9, 20),
            Arrays.asList(15, 7)
        );

        assertEquals(expected, solution.levelOrder(root));
    }
}
