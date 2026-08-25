package com.exercises.advanced.p57nqueens;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class NQueensTest {
    private final NQueens solution = new NQueens();

    @Test
    public void testSolveNQueens() {
        assertEquals(2, solution.solveNQueens(4).size());
        assertEquals(1, solution.solveNQueens(1).size());
        assertEquals(0, solution.solveNQueens(2).size());
    }
}
