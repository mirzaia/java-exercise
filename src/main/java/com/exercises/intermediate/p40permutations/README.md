# 40 — Permutations

**Tier:** Intermediate · **Source:** LeetCode 46 (Medium) · **Topics:** Backtracking

## Problem

Given an array of distinct numbers, return every possible ordering of them.

**Example:** `[1,2,3]` →
`[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]`

## Brief explanation

Building a permutation is choosing, one slot at a time, which unused
number goes next. Backtracking tries every unused number in the next slot,
recurses to fill the remaining slots, then "un-chooses" it (marks it unused
again) before trying the next candidate — so every ordering gets explored
exactly once.

## Proposed solutions

### Medium to code — Backtracking with a used[] tracker ✅ mostly accepted
Recurse with the permutation built so far and a boolean array marking which
numbers are already placed. When the current permutation is full length,
record it. Otherwise, try every unused number next, recurse, then unmark it.
**Time O(n · n!) · Space O(n)** recursion depth.

## Reference implementation

See [`solutions/intermediate/p40permutations/Permutations.java`](../../solutions/intermediate/p40permutations/Permutations.java).
Try implementing it yourself first — the test in this folder expects
`Permutations#permute` to be filled in.
