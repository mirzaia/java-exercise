package com.exercises.basic.p09validanagram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramTest {
    private final ValidAnagram solution = new ValidAnagram();

    @Test
    public void testIsAnagram() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
        assertFalse(solution.isAnagram("rat", "car"));
        assertFalse(solution.isAnagram("aa", "a"));
    }
}
