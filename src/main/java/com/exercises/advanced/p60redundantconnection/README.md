# 60 — Redundant Connection

**Tier:** Advanced · **Source:** LeetCode 684 (Medium) · **Topics:** Union-Find

## Problem

A tree got one extra edge added, creating a single cycle. Find the edge
that can be removed to make it a tree again — if several would work, return
the one that appears last in the input.

**Example:** `[[1,2],[1,3],[2,3]]` → `[2,3]`

## Brief explanation

A tree never has a cycle — every edge you add should connect two
*previously separate* groups of nodes. Union-Find is built exactly for
tracking "which group is each node currently in?" As you add edges one at a
time, the very first edge that tries to connect two nodes *already* in the
same group is, by definition, the one creating the cycle.

## Proposed solutions

### Medium to code — Union-Find (Disjoint Set) ✅ mostly accepted
Process edges in order. For each edge, find the "root" representative of
each endpoint's group. If both endpoints are already in the same group,
this edge is redundant — return it. Otherwise, merge (union) their groups
and continue.
**Time ~O(n · α(n))** (α = inverse Ackermann, effectively constant)
**· Space O(n)**

## Reference implementation

See [`solutions/advanced/p60redundantconnection/RedundantConnection.java`](../../solutions/advanced/p60redundantconnection/RedundantConnection.java).
Try implementing it yourself first — the test in this folder expects
`RedundantConnection#findRedundantConnection` to be filled in.
