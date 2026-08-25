package com.exercises.solutions.advanced.p51serializebinarytree;

import com.exercises.common.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;

public class Codec {
    // Preorder traversal with explicit "null" markers for missing children;
    // deserializing just replays the same preorder recursion, consuming
    // tokens one at a time. Time O(n) for both directions, Space O(n).
    private static final String NULL_MARKER = "#";
    private static final String DELIMITER = ",";

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NULL_MARKER).append(DELIMITER);
            return;
        }
        sb.append(node.val).append(DELIMITER);
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    public TreeNode deserialize(String data) {
        Deque<String> tokens = new ArrayDeque<>(java.util.Arrays.asList(data.split(DELIMITER)));
        return deserializeHelper(tokens);
    }

    private TreeNode deserializeHelper(Deque<String> tokens) {
        String token = tokens.poll();
        if (token == null || token.equals(NULL_MARKER)) return null;
        TreeNode node = new TreeNode(Integer.parseInt(token));
        node.left = deserializeHelper(tokens);
        node.right = deserializeHelper(tokens);
        return node;
    }
}
