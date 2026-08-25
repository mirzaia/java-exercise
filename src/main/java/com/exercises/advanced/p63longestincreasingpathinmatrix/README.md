# 63 — Longest Increasing Path in a Matrix

**Tier:** Advanced · **Source:** LeetCode 329 (Hard) · **Topics:** Grid DFS, Memoization

## Problem

In a grid of numbers, find the longest path where every step moves to a
strictly larger neighbor (up/down/left/right only).

**Example:** `[[9,9,4],[6,6,8],[2,1,1]]` → `4` (the path `1 → 2 → 6 → 9`)

## Brief explanation

Because every step must strictly increase, the grid's values naturally
prevent cycles — you can never revisit a cell. That means "longest
increasing path starting at this cell" only ever depends on its neighbors'
own answers to the exact same question, and once you've computed a cell's
answer, it will always be the same no matter which path led you there — so
it's worth remembering (memoizing) instead of recomputing.

## Proposed solutions

### Medium to code — DFS without memoization
DFS from every cell, exploring every increasing path.
**Time exponential in the worst case** — correct but far too slow, since the
same sub-paths get recomputed repeatedly from different starting cells.

### Hard to code — DFS with memoization ✅ mostly accepted
DFS from each cell, only continuing to strictly larger neighbors; cache
"longest increasing path starting here" once computed, so every cell's
sub-answer is calculated exactly once no matter how many paths pass through it.
**Time O(rows × cols) · Space O(rows × cols)**

## Reference implementation

See [`solutions/advanced/p63longestincreasingpathinmatrix/LongestIncreasingPathInMatrix.java`](../../solutions/advanced/p63longestincreasingpathinmatrix/LongestIncreasingPathInMatrix.java).
Try implementing it yourself first — the test in this folder expects
`LongestIncreasingPathInMatrix#longestIncreasingPath` to be filled in.
