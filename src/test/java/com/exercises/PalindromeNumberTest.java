package com.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {
    private final PalindromeNumber solution = new PalindromeNumber();

    @Test
    public void testIsPalindrome() {
        assertTrue(solution.isPalindrome(121));
        assertFalse(solution.isPalindrome(-121));
        assertFalse(solution.isPalindrome(10));
        assertTrue(solution.isPalindrome(12321));
        assertTrue(solution.isPalindrome(0));
    }
}
