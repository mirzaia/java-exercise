# 31 — Binary Tree Level Order Traversal

**Tier:** Intermediate · **Source:** LeetCode 102 (Medium) · **Topics:** Tree, BFS

## Problem

Return the values of a binary tree grouped level by level, top to bottom,
left to right within each level.

**Example:** `[3,9,20,null,null,15,7]` → `[[3],[9,20],[15,7]]`

## Brief explanation

This is a textbook breadth-first search: visit nodes nearest the root
first, then the next ring out, and so on. A queue naturally processes nodes
in that order — the trick is to snapshot "how many nodes are currently in
the queue" before draining a level, so you know exactly where one level ends
and the next begins.

## Proposed solutions

### Medium to code — BFS with level-size snapshot ✅ mostly accepted
Use a queue starting with the root. At each iteration, record the current
queue size (that's exactly how many nodes are in this level), then dequeue
that many nodes, collecting their values and enqueuing their children.
**Time O(n) · Space O(n)**

## Reference implementation

See [`solutions/intermediate/p31binarytreelevelorder/BinaryTreeLevelOrder.java`](../../solutions/intermediate/p31binarytreelevelorder/BinaryTreeLevelOrder.java).
Try implementing it yourself first — the test in this folder expects
`BinaryTreeLevelOrder#levelOrder` to be filled in.
