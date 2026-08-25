package com.exercises.intermediate.p41kthlargestelement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KthLargestElementTest {
    private final KthLargestElement solution = new KthLargestElement();

    @Test
    public void testFindKthLargest() {
        assertEquals(5, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        assertEquals(4, solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
