# 18 — Invert Binary Tree

**Tier:** Basic · **Source:** LeetCode 226 (Easy) · **Topics:** Tree, BFS/DFS, Recursion

## Problem

Given a binary tree, mirror it — every node's left and right children swap
places, all the way down — and return the root.

**Example:** `[4,2,7,1,3,6,9]` → `[4,7,2,9,6,3,1]`

## Brief explanation

"Invert the whole tree" breaks down into "invert the left subtree, invert
the right subtree, then swap them at this node" — and that's true at every
single node, all the way down to the leaves. That repeating structure is
exactly what recursion is for.

## Proposed solutions

### Easy to code — Recursive swap ✅ mostly accepted
At each node: recursively invert the left subtree, recursively invert the
right subtree, then swap the (now-inverted) left and right pointers.
**Time O(n) · Space O(h)** where h is the tree height (call stack depth).

## Reference implementation

See [`solutions/basic/p18invertbinarytree/InvertBinaryTree.java`](../../solutions/basic/p18invertbinarytree/InvertBinaryTree.java).
Try implementing it yourself first — the test in this folder expects
`InvertBinaryTree#invertTree` to be filled in.
