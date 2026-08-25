# 45 — Merge k Sorted Lists

**Tier:** Advanced · **Source:** LeetCode 23 (Hard) · **Topics:** Heap, Linked List, Divide & Conquer

## Problem

Merge `k` already-sorted linked lists into a single sorted list.

**Example:** `[1,4,5]`, `[1,3,4]`, `[2,6]` → `[1,1,2,3,4,4,5,6]`

## Brief explanation

This is the same idea as merging two sorted lists (problem 06), just with
more than two lists at once. Instead of comparing k front-nodes by hand
every step, a min-heap keeps track of "which list currently has the
smallest front value" for you automatically — pop the smallest, output it,
and push whatever came after it in its own list.

## Proposed solutions

### Medium to code — Merge two at a time
Repeatedly merge pairs of lists using the two-list merge from problem 06,
until only one list remains.
**Time O(N log k) · Space O(1)** extra (excluding recursion/temp lists).

### Hard to code — Min-heap of list heads ✅ mostly accepted
Push every list's current front node onto a min-heap keyed by value. Pop the
smallest, attach it to the output, and if it had a successor, push that
successor. Repeat until the heap is empty.
**Time O(N log k) · Space O(k)** where N is total nodes, k is the list count.

## Reference implementation

See [`solutions/advanced/p45mergeksortedlists/MergeKSortedLists.java`](../../solutions/advanced/p45mergeksortedlists/MergeKSortedLists.java).
Try implementing it yourself first — the test in this folder expects
`MergeKSortedLists#mergeKLists` to be filled in.
