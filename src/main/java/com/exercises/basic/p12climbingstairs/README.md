# 12 — Climbing Stairs

**Tier:** Basic · **Source:** LeetCode 70 (Easy) · **Topics:** DP, Math

## Problem

You can climb 1 or 2 steps at a time. Given `n` steps total, how many
distinct ways are there to reach the top?

**Example:** `n = 3` → `3` (`1+1+1`, `1+2`, `2+1`)

## Brief explanation

To reach step `n`, your very last move was either a single step from step
`n-1`, or a double step from step `n-2`. So the number of ways to reach step
`n` is just the number of ways to reach `n-1` plus the number of ways to
reach `n-2` — this is exactly the Fibonacci sequence in disguise.

## Proposed solutions

### Medium to code — Bottom-up DP ✅ mostly accepted
Build up the answer from the smallest steps: keep only the previous two
results and add them together to get the next one, instead of recomputing
from scratch (which is what naive recursion would do).
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/basic/p12climbingstairs/ClimbingStairs.java`](../../solutions/basic/p12climbingstairs/ClimbingStairs.java).
Try implementing it yourself first — the test in this folder expects
`ClimbingStairs#climbStairs` to be filled in.
