package com.exercises.solutions.advanced.p62longestconsecutivesequence;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestConsecutiveSequenceTest {
    private final LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

    @Test
    public void testLongestConsecutive() {
        assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        assertEquals(9, solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}
