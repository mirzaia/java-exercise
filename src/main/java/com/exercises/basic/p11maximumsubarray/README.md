# 11 — Maximum Subarray

**Tier:** Basic · **Source:** LeetCode 53 (Medium) · **Topics:** Array, DP, Kadane's Algorithm

## Problem

Find the contiguous run of numbers in `nums` whose sum is the largest
possible, and return that sum.

**Example:** `[-2,1,-3,4,-1,2,1,-5,4]` → `6` (the run `[4,-1,2,1]`)

## Brief explanation

As you walk the array, keep a running sum of "the best subarray ending
right here." If that running sum ever drops below the value of the current
number alone, you're better off throwing away everything before it and
starting fresh from here — dragging along a negative sum only makes future
sums smaller.

## Proposed solutions

### Easy to code — Brute force
Try every possible start and end index and sum each subarray.
**Time O(n²) · Space O(1)** — correct, too slow for large inputs.

### Medium to code — Kadane's algorithm ✅ mostly accepted
Keep a running sum for "best subarray ending here." At each step, either
extend it by the current number, or start over at the current number if that
running sum has already gone negative. Track the best value seen.
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/basic/p11maximumsubarray/MaximumSubarray.java`](../../solutions/basic/p11maximumsubarray/MaximumSubarray.java).
Try implementing it yourself first — the test in this folder expects
`MaximumSubarray#maxSubArray` to be filled in.
