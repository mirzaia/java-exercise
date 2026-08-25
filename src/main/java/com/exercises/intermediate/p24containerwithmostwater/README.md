# 24 — Container With Most Water

**Tier:** Intermediate · **Source:** LeetCode 11 (Medium) · **Topics:** Two Pointers, Greedy

## Problem

Each index has a vertical line of a given height. Pick two lines that,
together with the x-axis, trap the most water. Return that max area.

**Example:** `[1,8,6,2,5,4,8,3,7]` → `49`

## Brief explanation

The water held between two lines is limited by the *shorter* of the two,
times the distance between them. Start with the widest possible container
(the two ends) and shrink inward — but always move the pointer at the
*shorter* line, because keeping a short line while narrowing the width can
only ever get worse, never better.

## Proposed solutions

### Easy to code — Brute force
Check every pair of lines and compute the area.
**Time O(n²) · Space O(1)** — correct, too slow for large inputs.

### Medium to code — Two pointers, move the shorter side ✅ mostly accepted
Start with pointers at both ends. Compute the area, then move whichever
pointer points at the shorter line inward (moving the taller one can never
improve the area, since width can only shrink).
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/intermediate/p24containerwithmostwater/ContainerWithMostWater.java`](../../solutions/intermediate/p24containerwithmostwater/ContainerWithMostWater.java).
Try implementing it yourself first — the test in this folder expects
`ContainerWithMostWater#maxArea` to be filled in.
