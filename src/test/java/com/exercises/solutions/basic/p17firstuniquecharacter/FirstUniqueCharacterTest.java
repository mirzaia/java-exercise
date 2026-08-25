package com.exercises.solutions.basic.p17firstuniquecharacter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstUniqueCharacterTest {
    private final FirstUniqueCharacter solution = new FirstUniqueCharacter();

    @Test
    public void testFirstUniqChar() {
        assertEquals(0, solution.firstUniqChar("leetcode"));
        assertEquals(2, solution.firstUniqChar("loveleetcode"));
        assertEquals(-1, solution.firstUniqChar("aabb"));
    }
}
