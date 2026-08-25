package com.exercises.solutions.basic.p11maximumsubarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaximumSubarrayTest {
    private final MaximumSubarray solution = new MaximumSubarray();

    @Test
    public void testMaxSubArray() {
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, solution.maxSubArray(new int[]{1}));
        assertEquals(23, solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
