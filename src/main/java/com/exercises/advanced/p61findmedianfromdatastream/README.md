# 61 — Find Median from Data Stream

**Tier:** Advanced · **Source:** LeetCode 295 (Hard) · **Topics:** Two Heaps, Design

## Problem

Design a structure that can keep accepting numbers one at a time
(`addNum`) and report the running median (`findMedian`) efficiently at any
point.

**Example:** add 1, add 2 → median `1.5`; add 3 → median `2.0`

## Brief explanation

The median only cares about the boundary between the "smaller half" and
the "larger half" of everything seen so far. Keep two heaps: a max-heap
holding the smaller half (so its biggest value is right at the top), and a
min-heap holding the larger half (so its smallest value is right at the
top). Keep them balanced in size, and the median is always immediately
available from the top of one or both heaps.

## Proposed solutions

### Easy to code — Sorted list, insert in order
Keep a sorted list; insert each new number at the correct position and read
the middle element(s).
**Time O(n) per insert · Space O(n)** — correct, but insertion is slow for a
long stream.

### Hard to code — Two heaps ✅ mostly accepted
A max-heap for the lower half, a min-heap for the upper half. Every insert
goes into the max-heap first, then its top moves to the min-heap to keep
values properly ordered across the split; rebalance sizes if they drift more
than one apart. The median comes straight from the top(s).
**Time O(log n) per `addNum`, O(1) per `findMedian` · Space O(n)**

## Reference implementation

See [`solutions/advanced/p61findmedianfromdatastream/MedianFinder.java`](../../solutions/advanced/p61findmedianfromdatastream/MedianFinder.java).
Try implementing it yourself first — the test in this folder expects
`MedianFinder#addNum / #findMedian` to be filled in.
