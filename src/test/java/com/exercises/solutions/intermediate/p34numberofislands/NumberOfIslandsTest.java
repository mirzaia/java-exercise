package com.exercises.solutions.intermediate.p34numberofislands;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberOfIslandsTest {
    private final NumberOfIslands solution = new NumberOfIslands();

    @Test
    public void testNumIslands() {
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, solution.numIslands(grid1));

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, solution.numIslands(grid2));
    }
}
