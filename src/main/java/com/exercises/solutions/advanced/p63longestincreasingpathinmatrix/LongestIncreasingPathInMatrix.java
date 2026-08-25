package com.exercises.solutions.advanced.p63longestincreasingpathinmatrix;

public class LongestIncreasingPathInMatrix {
    // DFS from every cell, memoizing "longest increasing path starting
    // here" so overlapping sub-paths are never recomputed. Time O(rows *
    // cols), Space O(rows * cols) for the memo and recursion stack.
    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private int[][] memo;
    private int[][] matrix;

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        this.matrix = matrix;
        int rows = matrix.length, cols = matrix[0].length;
        memo = new int[rows][cols];
        int best = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                best = Math.max(best, dfs(r, c));
            }
        }
        return best;
    }

    private int dfs(int r, int c) {
        if (memo[r][c] != 0) return memo[r][c];
        int best = 1;
        for (int[] dir : DIRECTIONS) {
            int nr = r + dir[0], nc = c + dir[1];
            if (nr >= 0 && nr < matrix.length && nc >= 0 && nc < matrix[0].length
                    && matrix[nr][nc] > matrix[r][c]) {
                best = Math.max(best, 1 + dfs(nr, nc));
            }
        }
        memo[r][c] = best;
        return best;
    }
}
