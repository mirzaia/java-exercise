# 06 — Merge Two Sorted Lists

**Tier:** Basic · **Source:** LeetCode 21 (Easy) · **Topics:** Linked List, Recursion

## Problem

Given the heads of two sorted linked lists, merge them into one sorted list
by re-linking the existing nodes (don't build new ones), and return the head.

**Example:** `[1,2,4]` + `[1,3,4]` → `[1,1,2,3,4,4]`

## Brief explanation

Both lists are already sorted, so you never need to look ahead — you only
ever need to compare the two current front nodes and take the smaller one.
It's the same idea as merging two sorted piles of cards face-up: always take
whichever pile's top card is smaller.

## Proposed solutions

### Medium to code — Dummy head + iterative merge ✅ mostly accepted
Create a placeholder "dummy" node so you never need special-case logic for
the first node. Walk both lists, always attaching the smaller front node to
the result, then attach whatever's left of the non-empty list at the end.
**Time O(n + m) · Space O(1)** extra pointers.

## Reference implementation

See [`solutions/basic/p06mergetwosortedlists/MergeTwoSortedLists.java`](../../solutions/basic/p06mergetwosortedlists/MergeTwoSortedLists.java).
Try implementing it yourself first — the test in this folder expects
`MergeTwoSortedLists#mergeTwoLists` to be filled in.
