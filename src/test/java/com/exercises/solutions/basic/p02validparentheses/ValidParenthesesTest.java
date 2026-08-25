package com.exercises.solutions.basic.p02validparentheses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
    private final ValidParentheses solution = new ValidParentheses();

    @Test
    public void testIsValid() {
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("()[]{}"));
        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("([)]"));
        assertTrue(solution.isValid("{[]}"));
        assertTrue(solution.isValid(""));
    }
}
