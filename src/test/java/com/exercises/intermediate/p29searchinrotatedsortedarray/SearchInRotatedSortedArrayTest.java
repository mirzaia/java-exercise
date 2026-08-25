package com.exercises.intermediate.p29searchinrotatedsortedarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchInRotatedSortedArrayTest {
    private final SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    @Test
    public void testSearch() {
        assertEquals(4, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(-1, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        assertEquals(0, solution.search(new int[]{1}, 1));
    }
}
