package com.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeIntervalsTest {
    private final MergeIntervals solution = new MergeIntervals();

    @Test
    public void testMerge() {
        int[][] input1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected1 = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected1, solution.merge(input1));

        int[][] input2 = {{1, 4}, {4, 5}};
        int[][] expected2 = {{1, 5}};
        assertArrayEquals(expected2, solution.merge(input2));
    }
}
