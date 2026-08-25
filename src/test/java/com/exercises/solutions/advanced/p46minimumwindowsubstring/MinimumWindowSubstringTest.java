package com.exercises.solutions.advanced.p46minimumwindowsubstring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinimumWindowSubstringTest {
    private final MinimumWindowSubstring solution = new MinimumWindowSubstring();

    @Test
    public void testMinWindow() {
        assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"));
        assertEquals("", solution.minWindow("a", "aa"));
        assertEquals("a", solution.minWindow("a", "a"));
    }
}
