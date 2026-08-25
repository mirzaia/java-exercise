package com.exercises.solutions.advanced.p60redundantconnection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RedundantConnectionTest {
    private final RedundantConnection solution = new RedundantConnection();

    @Test
    public void testFindRedundantConnection() {
        assertArrayEquals(new int[]{2, 3}, solution.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}}));
        assertArrayEquals(new int[]{1, 4}, solution.findRedundantConnection(
                new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}));
    }
}
