package com.exercises.solutions.advanced.p50wordsearchii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSearchII {
    // Build a trie of all target words, then DFS the board once, walking
    // the trie alongside the DFS path so branches that can't match any
    // word are abandoned immediately. Time O(rows*cols*4^L) worst case
    // (L = max word length), Space O(sum of word lengths) for the trie.
    private static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        String word = null;
    }

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                node = node.children.computeIfAbsent(c, k -> new TrieNode());
            }
            node.word = word;
        }

        List<String> result = new ArrayList<>();
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                dfs(board, r, c, root, result);
            }
        }
        return result;
    }

    private void dfs(char[][] board, int r, int c, TrieNode node, List<String> result) {
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) return;
        char ch = board[r][c];
        if (ch == '#' || !node.children.containsKey(ch)) return;

        TrieNode next = node.children.get(ch);
        if (next.word != null) {
            result.add(next.word);
            next.word = null; // avoid duplicate results
        }

        board[r][c] = '#'; // mark visited
        dfs(board, r + 1, c, next, result);
        dfs(board, r - 1, c, next, result);
        dfs(board, r, c + 1, next, result);
        dfs(board, r, c - 1, next, result);
        board[r][c] = ch; // restore
    }
}
