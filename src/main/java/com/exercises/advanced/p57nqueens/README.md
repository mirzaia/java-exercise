# 57 — N-Queens

**Tier:** Advanced · **Source:** LeetCode 51 (Hard) · **Topics:** Backtracking

## Problem

Place `n` queens on an `n x n` board so none attack each other (no shared
row, column, or diagonal). Return every distinct valid arrangement.

**Example:** `n = 4` → 2 solutions.

## Brief explanation

Since no two queens can share a row, you only ever need to decide *which
column* each row's queen goes in — one row at a time. Backtracking tries
each column for the current row, skips any column/diagonal already used by
an earlier queen, and undoes the choice to try the next option if it leads
to a dead end.

## Proposed solutions

### Hard to code — Backtracking with column/diagonal tracking ✅ mostly accepted
Place a queen per row, left to right. Track which columns and which two
families of diagonals (`col - row` and `col + row` are constant along a
diagonal) are already occupied, so each candidate placement can be checked
in O(1). Backtrack (undo and try the next column) whenever a row runs out of
safe columns.
**Time O(n!)** worst case (heavily pruned in practice) **· Space O(n)**.

## Reference implementation

See [`solutions/advanced/p57nqueens/NQueens.java`](../../solutions/advanced/p57nqueens/NQueens.java).
Try implementing it yourself first — the test in this folder expects
`NQueens#solveNQueens` to be filled in.
