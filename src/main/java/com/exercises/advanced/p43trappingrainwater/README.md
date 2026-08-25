# 43 — Trapping Rain Water

**Tier:** Advanced · **Source:** LeetCode 42 (Hard) · **Topics:** Two Pointers, Monotonic Stack, DP

## Problem

Given bar heights forming an elevation map, compute how much water is
trapped between the bars after it rains.

**Example:** `[0,1,0,2,1,0,1,3,2,1,2,1]` → `6`

## Brief explanation

The water sitting above any single bar is limited by whichever is shorter:
the tallest wall to its left, or the tallest wall to its right — water always
spills over the lower side. Two pointers moving inward from both ends let
you always know, at any moment, which side's wall-height is fully settled
and safe to use.

## Proposed solutions

### Easy to code — Precompute left/right max arrays
For each bar, precompute the tallest bar to its left and to its right; the
trapped water there is `min(leftMax, rightMax) - height[i]`.
**Time O(n) · Space O(n)**

### Hard to code — Two pointers ✅ mostly accepted
Move `left`/`right` pointers inward, tracking a running max from each side.
Always process whichever side currently has the smaller running max — that
side's water level is already fully determined, since the *other* side is
guaranteed to have an equal or taller wall somewhere.
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/advanced/p43trappingrainwater/TrappingRainWater.java`](../../solutions/advanced/p43trappingrainwater/TrappingRainWater.java).
Try implementing it yourself first — the test in this folder expects
`TrappingRainWater#trap` to be filled in.
