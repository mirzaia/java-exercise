package com.exercises.solutions.advanced.p57nqueens;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueens {
    // Backtracking, placing one queen per row. Track occupied columns and
    // both diagonals (col - row and col + row are constant along a
    // diagonal) so each placement can be checked in O(1). Time O(n!)
    // worst case, Space O(n).
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queenCol = new int[n]; // queenCol[row] = column of the queen in that row
        backtrack(0, n, queenCol, new HashSet<>(), new HashSet<>(), new HashSet<>(), result);
        return result;
    }

    private void backtrack(int row, int n, int[] queenCol, Set<Integer> cols,
                            Set<Integer> diag1, Set<Integer> diag2, List<List<String>> result) {
        if (row == n) {
            result.add(buildBoard(queenCol, n));
            return;
        }
        for (int col = 0; col < n; col++) {
            int d1 = col - row, d2 = col + row;
            if (cols.contains(col) || diag1.contains(d1) || diag2.contains(d2)) continue;
            queenCol[row] = col;
            cols.add(col); diag1.add(d1); diag2.add(d2);
            backtrack(row + 1, n, queenCol, cols, diag1, diag2, result);
            cols.remove(col); diag1.remove(d1); diag2.remove(d2);
        }
    }

    private List<String> buildBoard(int[] queenCol, int n) {
        List<String> board = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            char[] line = new char[n];
            java.util.Arrays.fill(line, '.');
            line[queenCol[row]] = 'Q';
            board.add(new String(line));
        }
        return board;
    }
}
