package com.exercises.solutions.basic.p10validpalindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeTest {
    private final ValidPalindrome solution = new ValidPalindrome();

    @Test
    public void testIsPalindrome() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(solution.isPalindrome("race a car"));
        assertTrue(solution.isPalindrome(" "));
    }
}
