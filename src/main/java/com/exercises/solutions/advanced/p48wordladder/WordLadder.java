package com.exercises.solutions.advanced.p48wordladder;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
    // BFS over the "one letter different" graph of words; BFS naturally
    // finds the shortest path in an unweighted graph. Time O(n * L^2 * 26)
    // where n is word count and L is word length, Space O(n * L).
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dictionary = new HashSet<>(wordList);
        if (!dictionary.contains(endWord)) return 0;

        Queue<String> queue = new ArrayDeque<>();
        queue.add(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int steps = 1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                String word = queue.poll();
                if (word.equals(endWord)) return steps;
                char[] chars = word.toCharArray();
                for (int pos = 0; pos < chars.length; pos++) {
                    char original = chars[pos];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == original) continue;
                        chars[pos] = c;
                        String candidate = new String(chars);
                        if (dictionary.contains(candidate) && visited.add(candidate)) {
                            queue.add(candidate);
                        }
                    }
                    chars[pos] = original;
                }
            }
            steps++;
        }
        return 0;
    }
}
