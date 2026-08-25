package com.exercises.basic.p01twosum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

public class TwoSumTest {
    private final TwoSum solution = new TwoSum();

    @Test
    public void testTwoSum() {
        int[] result1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        Arrays.sort(result1);
        assertArrayEquals(new int[]{0, 1}, result1);

        int[] result2 = solution.twoSum(new int[]{3, 2, 4}, 6);
        Arrays.sort(result2);
        assertArrayEquals(new int[]{1, 2}, result2);

        int[] result3 = solution.twoSum(new int[]{3, 3}, 6);
        Arrays.sort(result3);
        assertArrayEquals(new int[]{0, 1}, result3);
    }
}
