# 28 — Merge Intervals

**Tier:** Intermediate · **Source:** LeetCode 56 (Medium) · **Topics:** Array, Sorting, Intervals

## Problem

Given a list of `[start, end]` intervals, merge every pair that overlaps
and return the resulting non-overlapping intervals.

**Example:** `[[1,3],[2,6],[8,10],[15,18]]` → `[[1,6],[8,10],[15,18]]`

## Brief explanation

Once the intervals are sorted by their start time, any two intervals that
overlap must be *next to each other* in that sorted order. So you only ever
need to compare each interval against the one you're currently building up —
if it starts before the current one ends, stretch the current one; otherwise
start a new one.

## Proposed solutions

### Medium to code — Sort then sweep ✅ mostly accepted
Sort intervals by start. Walk through them, keeping a "current merged
interval." If the next interval starts before (or right at) the current
one's end, extend the current one's end; otherwise, close off the current
one and start a new one.
**Time O(n log n) · Space O(n)**

## Reference implementation

See [`solutions/intermediate/p28mergeintervals/MergeIntervals.java`](../../solutions/intermediate/p28mergeintervals/MergeIntervals.java).
Try implementing it yourself first — the test in this folder expects
`MergeIntervals#merge` to be filled in.
