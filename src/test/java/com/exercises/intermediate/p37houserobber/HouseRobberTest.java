package com.exercises.intermediate.p37houserobber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HouseRobberTest {
    private final HouseRobber solution = new HouseRobber();

    @Test
    public void testRob() {
        assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
        assertEquals(12, solution.rob(new int[]{2, 7, 9, 3, 1}));
        assertEquals(0, solution.rob(new int[]{}));
    }
}
