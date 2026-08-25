package com.exercises.solutions.intermediate.p30longestpalindromicsubstring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestPalindromicSubstringTest {
    private final LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

    @Test
    public void testLongestPalindrome() {
        String result = solution.longestPalindrome("babad");
        assertTrue(result.equals("bab") || result.equals("aba"));
        assertEquals("bb", solution.longestPalindrome("cbbd"));
        assertEquals("a", solution.longestPalindrome("a"));
    }
}
