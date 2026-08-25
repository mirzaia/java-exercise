package com.exercises.advanced.p54regularexpressionmatching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegularExpressionMatchingTest {
    private final RegularExpressionMatching solution = new RegularExpressionMatching();

    @Test
    public void testIsMatch() {
        assertTrue(solution.isMatch("aa", "a*"));
        assertFalse(solution.isMatch("mississippi", "mis*is*p*."));
        assertTrue(solution.isMatch("ab", ".*"));
        assertFalse(solution.isMatch("aa", "a"));
    }
}
