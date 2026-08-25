package com.exercises.solutions.basic.p15movezeroes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoveZeroesTest {
    private final MoveZeroes solution = new MoveZeroes();

    @Test
    public void testMoveZeroes() {
        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums1);

        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        assertArrayEquals(new int[]{0}, nums2);
    }
}
