package com.exercises.solutions.advanced.p50wordsearchii;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class WordSearchIITest {
    private final WordSearchII solution = new WordSearchII();

    @Test
    public void testFindWords() {
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        Set<String> result = new HashSet<>(solution.findWords(board, new String[]{"oath", "pea", "eat", "rain"}));
        assertEquals(Set.of("oath", "eat"), result);
    }
}
