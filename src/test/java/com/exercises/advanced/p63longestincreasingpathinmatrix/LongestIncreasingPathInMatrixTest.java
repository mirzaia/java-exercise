package com.exercises.advanced.p63longestincreasingpathinmatrix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestIncreasingPathInMatrixTest {
    private final LongestIncreasingPathInMatrix solution = new LongestIncreasingPathInMatrix();

    @Test
    public void testLongestIncreasingPath() {
        assertEquals(4, solution.longestIncreasingPath(new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}}));
        assertEquals(4, solution.longestIncreasingPath(new int[][]{{3, 4, 5}, {3, 2, 6}, {2, 2, 1}}));
    }
}
