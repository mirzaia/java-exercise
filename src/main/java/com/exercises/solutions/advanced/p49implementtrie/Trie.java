package com.exercises.solutions.advanced.p49implementtrie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    // Each node holds a map of next characters and whether a word ends
    // here. insert/search/startsWith are all O(word length), Space O(total
    // characters inserted).
    private static class Node {
        Map<Character, Node> children = new HashMap<>();
        boolean isWordEnd = false;
    }

    private final Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node current = root;
        for (char c : word.toCharArray()) {
            current = current.children.computeIfAbsent(c, k -> new Node());
        }
        current.isWordEnd = true;
    }

    public boolean search(String word) {
        Node node = find(word);
        return node != null && node.isWordEnd;
    }

    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    private Node find(String s) {
        Node current = root;
        for (char c : s.toCharArray()) {
            current = current.children.get(c);
            if (current == null) return null;
        }
        return current;
    }
}
