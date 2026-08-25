package com.exercises.advanced.p55longestvalidparentheses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestValidParenthesesTest {
    private final LongestValidParentheses solution = new LongestValidParentheses();

    @Test
    public void testLongestValidParentheses() {
        assertEquals(2, solution.longestValidParentheses("(()"));
        assertEquals(4, solution.longestValidParentheses(")()())"));
        assertEquals(0, solution.longestValidParentheses(""));
    }
}
