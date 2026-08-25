# 51 — Serialize and Deserialize Binary Tree

**Tier:** Advanced · **Source:** LeetCode 297 (Hard) · **Topics:** Tree, BFS/DFS, Design

## Problem

Design a way to turn a binary tree into a string, and back into the exact
same tree structure.

**Example:** `[3,9,20,null,null,15,7]` → some string → the identical tree
when deserialized.

## Brief explanation

The trick is to record *where the tree is empty*, not just the values —
otherwise you can't tell where each subtree ends. Write the tree out in
preorder (node, then left, then right), and explicitly write a marker
(like `"#"`) every time you would have recursed into a missing child. Reading
that same sequence back in preorder order reconstructs the tree exactly.

## Proposed solutions

### Hard to code — Preorder with null markers ✅ mostly accepted
Serializing: write each node's value, then recurse left, then right; write a
marker token wherever a child is missing. Deserializing: read tokens in the
same order, rebuilding the tree recursively — a marker token means "this
subtree is empty," any other token becomes a new node.
**Time O(n) both ways · Space O(n)**

## Reference implementation

See [`solutions/advanced/p51serializebinarytree/Codec.java`](../../solutions/advanced/p51serializebinarytree/Codec.java).
Try implementing it yourself first — the test in this folder expects
`Codec#serialize / #deserialize` to be filled in.
