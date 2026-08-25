package com.exercises.solutions.intermediate.p38longestincreasingsubsequence;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestIncreasingSubsequenceTest {
    private final LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();

    @Test
    public void testLengthOfLIS() {
        assertEquals(4, solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(1, solution.lengthOfLIS(new int[]{7, 7, 7, 7}));
        assertEquals(4, solution.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    }
}
