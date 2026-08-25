package com.exercises.solutions.basic.p13binarysearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {
    private final BinarySearch solution = new BinarySearch();

    @Test
    public void testSearch() {
        assertEquals(4, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        assertEquals(0, solution.search(new int[]{5}, 5));
    }
}
