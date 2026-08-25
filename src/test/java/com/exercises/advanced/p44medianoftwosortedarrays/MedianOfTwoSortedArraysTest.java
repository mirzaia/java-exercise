package com.exercises.advanced.p44medianoftwosortedarrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedianOfTwoSortedArraysTest {
    private final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

    @Test
    public void testFindMedianSortedArrays() {
        assertEquals(2.0, solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 1e-9);
        assertEquals(2.5, solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 1e-9);
    }
}
