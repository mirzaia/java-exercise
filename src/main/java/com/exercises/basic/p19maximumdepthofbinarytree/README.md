# 19 — Maximum Depth of Binary Tree

**Tier:** Basic · **Source:** LeetCode 104 (Easy) · **Topics:** Tree, BFS/DFS, Recursion

## Problem

Given a binary tree, return the number of nodes on its longest path from
root down to a leaf.

**Example:** `[3,9,20,null,null,15,7]` → `3`

## Brief explanation

The depth of a tree is just "1 (for this node) plus the depth of whichever
subtree is deeper." Since a subtree is itself a smaller tree, you can answer
the question for the whole tree by asking the exact same question of its two
children first.

## Proposed solutions

### Easy to code — Recursive depth ✅ mostly accepted
An empty tree has depth 0. Otherwise, the depth is `1 +
max(depth(left), depth(right))`.
**Time O(n) · Space O(h)** where h is the tree height (call stack depth).

## Reference implementation

See [`solutions/basic/p19maximumdepthofbinarytree/MaximumDepthOfBinaryTree.java`](../../solutions/basic/p19maximumdepthofbinarytree/MaximumDepthOfBinaryTree.java).
Try implementing it yourself first — the test in this folder expects
`MaximumDepthOfBinaryTree#maxDepth` to be filled in.
