package com.exercises.solutions.advanced.p51serializebinarytree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.exercises.common.TreeNode;

public class CodecTest {
    private final Codec codec = new Codec();

    @Test
    public void testSerializeDeserialize() {
        TreeNode root = TreeNode.fromLevelOrder(new Integer[]{3, 9, 20, null, null, 15, 7});
        String data = codec.serialize(root);
        TreeNode result = codec.deserialize(data);
        assertEquals(3, result.val);
        assertEquals(9, result.left.val);
        assertEquals(20, result.right.val);
        assertNull(result.left.left);
        assertEquals(15, result.right.left.val);
        assertEquals(7, result.right.right.val);

        assertNull(codec.deserialize(codec.serialize(null)));
    }
}
