# 44 — Median of Two Sorted Arrays

**Tier:** Advanced · **Source:** LeetCode 4 (Hard) · **Topics:** Binary Search, Divide & Conquer

## Problem

Given two already-sorted arrays, find the median of all their elements
combined, without fully merging them, in O(log(m+n)) time.

**Example:** `[1,3]` and `[2]` → `2.0`

## Brief explanation

The median splits a sorted sequence exactly in half. Instead of merging
both arrays (too slow), binary search for a "cut point" in the smaller array
such that, combined with a matching cut in the other array, everything to
the left of both cuts is smaller than everything to the right — that
alignment is exactly what defines the median.

## Proposed solutions

### Easy to code — Merge and index
Merge both arrays (like the merge step of merge sort) and read off the
middle element(s).
**Time O(m + n) · Space O(m + n)** — correct, but doesn't hit the required
O(log(m+n)).

### Hard to code — Binary search on the partition point ✅ mostly accepted
Binary search over how many elements to take from the smaller array so that,
combined with a matching count from the larger array, the left half and
right half are correctly balanced and ordered. Read the median directly off
the four boundary values.
**Time O(log(min(m, n))) · Space O(1)**

## Reference implementation

See [`solutions/advanced/p44medianoftwosortedarrays/MedianOfTwoSortedArrays.java`](../../solutions/advanced/p44medianoftwosortedarrays/MedianOfTwoSortedArrays.java).
Try implementing it yourself first — the test in this folder expects
`MedianOfTwoSortedArrays#findMedianSortedArrays` to be filled in.
