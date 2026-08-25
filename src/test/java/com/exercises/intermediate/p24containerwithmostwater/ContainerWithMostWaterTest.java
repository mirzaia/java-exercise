package com.exercises.intermediate.p24containerwithmostwater;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainerWithMostWaterTest {
    private final ContainerWithMostWater solution = new ContainerWithMostWater();

    @Test
    public void testMaxArea() {
        assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        assertEquals(1, solution.maxArea(new int[]{1, 1}));
    }
}
