# 23 — 3Sum

**Tier:** Intermediate · **Source:** LeetCode 15 (Medium) · **Topics:** Two Pointers, Sorting

## Problem

Find every unique triplet of numbers in `nums` that adds up to zero.

**Example:** `[-1,0,1,2,-1,-4]` → `[[-1,-1,2],[-1,0,1]]`

## Brief explanation

Sorting the array first makes duplicates easy to skip and lets you use the
Two Sum two-pointer trick: fix one number, then look for a pair in the *rest*
of the sorted array that cancels it out — moving the low pointer up when the
sum is too small, and the high pointer down when it's too big.

## Proposed solutions

### Easy to code — Brute force
Check every triplet of indices for a zero sum, dedupe results with a set.
**Time O(n³) · Space O(n)** — correct, too slow for large inputs.

### Medium to code — Sort + two pointers ✅ mostly accepted
Sort the array. Fix each number in turn as the "anchor," then use two
pointers (one from just after the anchor, one from the end) to find pairs
that sum to `-anchor`, skipping over duplicate values to avoid repeat triplets.
**Time O(n²) · Space O(n)** (for sorting and the output).

## Reference implementation

See [`solutions/intermediate/p23threesum/ThreeSum.java`](../../solutions/intermediate/p23threesum/ThreeSum.java).
Try implementing it yourself first — the test in this folder expects
`ThreeSum#threeSum` to be filled in.
