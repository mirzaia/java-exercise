package com.exercises.basic.p16mergesortedarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortedArrayTest {
    private final MergeSortedArray solution = new MergeSortedArray();

    @Test
    public void testMerge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        solution.merge(nums1, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);

        int[] nums2 = {1};
        solution.merge(nums2, 1, new int[]{}, 0);
        assertArrayEquals(new int[]{1}, nums2);
    }
}
