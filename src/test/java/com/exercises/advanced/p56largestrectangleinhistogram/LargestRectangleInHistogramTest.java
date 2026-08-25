package com.exercises.advanced.p56largestrectangleinhistogram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LargestRectangleInHistogramTest {
    private final LargestRectangleInHistogram solution = new LargestRectangleInHistogram();

    @Test
    public void testLargestRectangleArea() {
        assertEquals(10, solution.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        assertEquals(4, solution.largestRectangleArea(new int[]{2, 4}));
    }
}
