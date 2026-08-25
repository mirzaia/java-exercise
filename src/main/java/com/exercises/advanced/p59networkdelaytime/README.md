# 59 — Network Delay Time

**Tier:** Advanced · **Source:** LeetCode 743 (Medium) · **Topics:** Graph, Dijkstra

## Problem

A signal starts at node `k` and travels along weighted directed edges.
Return the time for the signal to reach *every* node, or `-1` if some node
is unreachable.

**Example:** `times=[[2,1,1],[2,3,1],[3,4,1]]`, n=4, k=2 → `2`

## Brief explanation

This is "shortest path from one starting node to every other node" on a
weighted graph — the classic use case for Dijkstra's algorithm. Always
expand whichever reachable-but-not-yet-finalized node currently has the
smallest known distance; once a node is finalized, its distance can never
improve, because everything you haven't visited yet is at least as far away.

## Proposed solutions

### Medium to code — Dijkstra's algorithm ✅ mostly accepted
Use a min-heap keyed by current best-known distance. Pop the nearest node,
and for each of its neighbors, check if going through the current node gives
a shorter path than what's currently known; if so, update it and push the
neighbor. The answer is the largest finalized distance across all nodes (or
-1 if any node was never reached).
**Time O(E log V) · Space O(V + E)**

## Reference implementation

See [`solutions/advanced/p59networkdelaytime/NetworkDelayTime.java`](../../solutions/advanced/p59networkdelaytime/NetworkDelayTime.java).
Try implementing it yourself first — the test in this folder expects
`NetworkDelayTime#networkDelayTime` to be filled in.
