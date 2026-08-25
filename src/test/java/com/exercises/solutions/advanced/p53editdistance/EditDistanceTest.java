package com.exercises.solutions.advanced.p53editdistance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EditDistanceTest {
    private final EditDistance solution = new EditDistance();

    @Test
    public void testMinDistance() {
        assertEquals(3, solution.minDistance("horse", "ros"));
        assertEquals(5, solution.minDistance("intention", "execution"));
        assertEquals(0, solution.minDistance("", ""));
    }
}
