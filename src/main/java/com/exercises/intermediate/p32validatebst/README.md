# 32 — Validate Binary Search Tree

**Tier:** Intermediate · **Source:** LeetCode 98 (Medium) · **Topics:** Tree, DFS, Recursion

## Problem

Check whether a binary tree satisfies the BST property everywhere: every
left descendant is smaller than its ancestor, every right descendant is
larger — not just for immediate children, but all the way down.

**Example:** `[5,1,4,null,null,3,6]` → `false` (4's subtree has a 3, but 4
sits to the right of 5's left child of 1, so `3 &lt; 5` breaks the rule)

## Brief explanation

It's not enough to check that each node is bigger than its left child and
smaller than its right child — a node deep in the left subtree still has to
be smaller than the *root*, not just its immediate parent. So as you recurse
down, carry a shrinking valid range (a lower and upper bound) that every
node underneath must fit inside.

## Proposed solutions

### Easy to code — In-order traversal check
An in-order traversal of a valid BST visits values in strictly increasing
order; walk the tree in-order and confirm each value is bigger than the last.
**Time O(n) · Space O(n)**

### Medium to code — Recursive bounds ✅ mostly accepted
Recurse with a `(lowerBound, upperBound)` pair. A node must fall strictly
between them; when recursing left, tighten the upper bound to the node's
value, when recursing right, tighten the lower bound.
**Time O(n) · Space O(h)** where h is the tree height.

## Reference implementation

See [`solutions/intermediate/p32validatebst/ValidateBST.java`](../../solutions/intermediate/p32validatebst/ValidateBST.java).
Try implementing it yourself first — the test in this folder expects
`ValidateBST#isValidBST` to be filled in.
