# 41 — Kth Largest Element in an Array

**Tier:** Intermediate · **Source:** LeetCode 215 (Medium) · **Topics:** Heap, Quickselect

## Problem

Return the kth largest value in an unsorted array (kth in sorted order, so
duplicates count individually).

**Example:** `[3,2,1,5,6,4]`, k=2 → `5`

## Brief explanation

You don't need to fully sort the array — you only need to know the k
biggest values, and specifically the smallest of those k. A min-heap capped
at size k is exactly the right tool: whenever it grows past k elements,
throwing away its smallest element always throws away something outside the
top-k, and after processing everything, the heap's smallest remaining value
*is* the kth largest overall.

## Proposed solutions

### Easy to code — Sort
Sort the array and index from the end.
**Time O(n log n) · Space O(log n)** for the sort.

### Medium to code — Min-heap of size k ✅ mostly accepted
Push every number onto a min-heap; whenever the heap grows past size k, pop
the smallest. After scanning everything, the heap's top is the kth largest.
**Time O(n log k) · Space O(k)**

### Hard to code — Quickselect
Partition like quicksort, but only recurse into the side that contains the
target rank, skipping the other half entirely.
**Time O(n) average, O(n²) worst case · Space O(1)**

## Reference implementation

See [`solutions/intermediate/p41kthlargestelement/KthLargestElement.java`](../../solutions/intermediate/p41kthlargestelement/KthLargestElement.java).
Try implementing it yourself first — the test in this folder expects
`KthLargestElement#findKthLargest` to be filled in.
