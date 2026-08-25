# 16 — Merge Sorted Array

**Tier:** Basic · **Source:** LeetCode 88 (Easy) · **Topics:** Two Pointers, Array

## Problem

`nums1` has extra trailing space (`m + n` slots, only the first `m` filled)
and `nums2` has `n` elements. Merge `nums2` into `nums1` in-place so the
result is one sorted array.

**Example:** `nums1=[1,2,3,0,0,0]` (m=3), `nums2=[2,5,6]` (n=3) → `[1,2,2,3,5,6]`

## Brief explanation

Merging from the *front* would force you to shift elements out of the way
constantly. Instead, merge from the *back*: `nums1` has empty space at the
end, so you can always safely drop the larger of the two current "tail"
candidates into the last unfilled slot, without ever overwriting a value you
still need to read.

## Proposed solutions

### Medium to code — Merge from the back ✅ mostly accepted
Keep three pointers: the end of the real data in `nums1`, the end of
`nums2`, and the end of the full array. Repeatedly place the bigger of the
two candidates at the write pointer and move it (and the write pointer)
left, until `nums2` is exhausted.
**Time O(m + n) · Space O(1)**

## Reference implementation

See [`solutions/basic/p16mergesortedarray/MergeSortedArray.java`](../../solutions/basic/p16mergesortedarray/MergeSortedArray.java).
Try implementing it yourself first — the test in this folder expects
`MergeSortedArray#merge` to be filled in.
