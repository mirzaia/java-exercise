package com.exercises.solutions.intermediate.p31binarytreelevelorder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.exercises.common.TreeNode;
import java.util.List;

public class BinaryTreeLevelOrderTest {
    private final BinaryTreeLevelOrder solution = new BinaryTreeLevelOrder();

    @Test
    public void testLevelOrder() {
        TreeNode root = TreeNode.fromLevelOrder(new Integer[]{3, 9, 20, null, null, 15, 7});
        assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)), solution.levelOrder(root));
        assertEquals(List.of(), solution.levelOrder(null));
    }
}
