# 39 — Subsets

**Tier:** Intermediate · **Source:** LeetCode 78 (Medium) · **Topics:** Backtracking

## Problem

Given an array of unique numbers, return every possible subset, including
the empty set and the full set.

**Example:** `[1,2,3]` →
`[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]`

## Brief explanation

Every subset is a set of decisions: for each number, either it's in the
subset or it isn't. Backtracking explores this decision tree directly —
record the current partial subset as a valid answer at every step, then try
adding each remaining number in turn, recursing, and removing it again
before trying the next option ("undoing" the choice to try a different one).

## Proposed solutions

### Medium to code — Backtracking ✅ mostly accepted
Recurse with a "current subset so far" and a starting index. Record the
current subset as one valid answer immediately, then for every number from
the start index onward, add it, recurse (with the next start index), then
remove it again before moving to the next number.
**Time O(n · 2ⁿ) · Space O(n)** recursion depth (2ⁿ subsets, each up to n long).

## Reference implementation

See [`solutions/intermediate/p39subsets/Subsets.java`](../../solutions/intermediate/p39subsets/Subsets.java).
Try implementing it yourself first — the test in this folder expects
`Subsets#subsets` to be filled in.
