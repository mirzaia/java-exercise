# 13 — Binary Search

**Tier:** Basic · **Source:** LeetCode 704 (Easy) · **Topics:** Binary Search

## Problem

Given a sorted array of distinct integers and a `target`, return its index,
or `-1` if it's not there — in O(log n) time.

**Example:** `[-1,0,3,5,9,12]`, target `9` → `4`

## Brief explanation

Because the array is sorted, you can always throw away half the remaining
possibilities with one comparison: look at the middle element — if it's too
small, the target must be to the right; if it's too big, the target must be
to the left. Repeating this keeps cutting the search space in half.

## Proposed solutions

### Easy to code — Linear scan
Check every element one by one until you find the target.
**Time O(n) · Space O(1)** — correct, but doesn't use the fact the array is sorted.

### Medium to code — Binary search ✅ mostly accepted
Keep `left`/`right` bounds. Check the middle: if it matches, done; if it's
too small, search the right half; if too big, search the left half.
**Time O(log n) · Space O(1)**

## Reference implementation

See [`solutions/basic/p13binarysearch/BinarySearch.java`](../../solutions/basic/p13binarysearch/BinarySearch.java).
Try implementing it yourself first — the test in this folder expects
`BinarySearch#search` to be filled in.
