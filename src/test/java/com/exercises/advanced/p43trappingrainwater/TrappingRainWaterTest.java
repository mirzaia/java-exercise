package com.exercises.advanced.p43trappingrainwater;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrappingRainWaterTest {
    private final TrappingRainWater solution = new TrappingRainWater();

    @Test
    public void testTrap() {
        assertEquals(6, solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(9, solution.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}
