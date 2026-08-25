# 33 — Lowest Common Ancestor of a BST

**Tier:** Intermediate · **Source:** LeetCode 235 (Medium) · **Topics:** Tree, BST, Recursion

## Problem

Given a BST and two of its nodes, find the deepest node that is an ancestor
of both.

**Example:** in `[6,2,8,0,4,7,9,null,null,3,5]`, the LCA of `2` and `4` is `2`
itself (since 2 is an ancestor of 4); the LCA of `2` and `8` is the root `6`.

## Brief explanation

In a BST, every node's value tells you which way to go: values less than
the node are to the left, values greater are to the right. Walk down from
the root — as long as both targets are on the same side, keep going that
way. The moment they split to different sides (or one of them *is* the
current node), you've found the point where their paths diverge — that's
the LCA.

## Proposed solutions

### Medium to code — Walk down using BST ordering ✅ mostly accepted
Start at the root. If both `p` and `q` are smaller than the current node, go
left; if both are bigger, go right. As soon as that's no longer true, the
current node is the LCA.
**Time O(h) · Space O(1)** where h is the tree height.

## Reference implementation

See [`solutions/intermediate/p33lowestcommonancestorofbst/LowestCommonAncestorOfBST.java`](../../solutions/intermediate/p33lowestcommonancestorofbst/LowestCommonAncestorOfBST.java).
Try implementing it yourself first — the test in this folder expects
`LowestCommonAncestorOfBST#lowestCommonAncestor` to be filled in.
