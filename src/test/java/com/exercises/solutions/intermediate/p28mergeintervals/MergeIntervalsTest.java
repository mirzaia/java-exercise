package com.exercises.solutions.intermediate.p28mergeintervals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeIntervalsTest {
    private final MergeIntervals solution = new MergeIntervals();

    @Test
    public void testMerge() {
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}},
                solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
        assertArrayEquals(new int[][]{{1, 5}}, solution.merge(new int[][]{{1, 4}, {4, 5}}));
    }
}
