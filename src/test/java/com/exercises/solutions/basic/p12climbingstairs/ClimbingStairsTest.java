package com.exercises.solutions.basic.p12climbingstairs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClimbingStairsTest {
    private final ClimbingStairs solution = new ClimbingStairs();

    @Test
    public void testClimbStairs() {
        assertEquals(2, solution.climbStairs(2));
        assertEquals(3, solution.climbStairs(3));
        assertEquals(8, solution.climbStairs(5));
    }
}
