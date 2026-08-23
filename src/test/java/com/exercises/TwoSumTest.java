package com.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

public class TwoSumTest {
    private final TwoSum solution = new TwoSum();

    @Test
    public void testTwoSum() {
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        Arrays.sort(result);
        assertArrayEquals(new int[]{0, 1}, result);

        result = solution.twoSum(new int[]{3, 2, 4}, 6);
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2}, result);

        result = solution.twoSum(new int[]{3, 3}, 6);
        Arrays.sort(result);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}
