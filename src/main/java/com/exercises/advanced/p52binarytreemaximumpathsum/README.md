# 52 — Binary Tree Maximum Path Sum

**Tier:** Advanced · **Source:** LeetCode 124 (Hard) · **Topics:** Tree, DFS, DP

## Problem

Find the maximum sum of any path through a binary tree, where a "path" is
any sequence of connected nodes (each visited once), and it doesn't have to
pass through the root or end at a leaf.

**Example:** `[1,2,3]` → `6` (the path `2 → 1 → 3`)

## Brief explanation

For each node, there are two different questions to answer. First: "what's
the best path that *passes through* this node, possibly using both its
children?" — that's a candidate for the overall answer. Second: "if this
node needs to hand a value *up* to its parent, what's the best it can
offer?" — and that can only use *one* child, because a path can't branch in
two directions at the same node once it continues upward. Negative
contributions from a child are worth skipping entirely (treat as 0).

## Proposed solutions

### Hard to code — Post-order DFS with a running global best ✅ mostly accepted
Recurse to get each child's best downward-only contribution (clamped to 0 if
negative). At the current node, check "value + left contribution + right
contribution" against a running global maximum. Return upward only "value +
the better of the two child contributions," since the path continuing to the
parent can only go one direction.
**Time O(n) · Space O(h)** where h is the tree height.

## Reference implementation

See [`solutions/advanced/p52binarytreemaximumpathsum/BinaryTreeMaximumPathSum.java`](../../solutions/advanced/p52binarytreemaximumpathsum/BinaryTreeMaximumPathSum.java).
Try implementing it yourself first — the test in this folder expects
`BinaryTreeMaximumPathSum#maxPathSum` to be filled in.
