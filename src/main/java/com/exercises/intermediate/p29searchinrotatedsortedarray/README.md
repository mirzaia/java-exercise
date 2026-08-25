# 29 — Search in Rotated Sorted Array

**Tier:** Intermediate · **Source:** LeetCode 33 (Medium) · **Topics:** Binary Search

## Problem

A sorted array has been rotated at some unknown point (e.g. `[4,5,6,7,0,1,2]`).
Find `target`'s index in O(log n) time, or return `-1`.

**Example:** `[4,5,6,7,0,1,2]`, target `0` → `4`

## Brief explanation

Even though the whole array isn't sorted anymore, splitting it at the
midpoint always leaves at least *one* of the two halves properly sorted.
Figure out which half is sorted, check whether the target could be hiding in
that sorted half, and search there — otherwise search the other half.

## Proposed solutions

### Medium to code — Modified binary search ✅ mostly accepted
At each step, compare `nums[left]` to `nums[mid]` to figure out which half
is the "normal," sorted one. If the target falls within that sorted half's
range, search there; otherwise search the other half.
**Time O(log n) · Space O(1)**

## Reference implementation

See [`solutions/intermediate/p29searchinrotatedsortedarray/SearchInRotatedSortedArray.java`](../../solutions/intermediate/p29searchinrotatedsortedarray/SearchInRotatedSortedArray.java).
Try implementing it yourself first — the test in this folder expects
`SearchInRotatedSortedArray#search` to be filled in.
