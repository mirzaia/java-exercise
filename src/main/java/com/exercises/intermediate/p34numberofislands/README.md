# 34 — Number of Islands

**Tier:** Intermediate · **Source:** LeetCode 200 (Medium) · **Topics:** Grid, BFS/DFS, Union-Find

## Problem

Given a grid of `'1'`s (land) and `'0'`s (water), count the islands — groups
of land cells connected up/down/left/right.

**Example:** a grid with two separate blobs of connected `'1'`s → `2`

## Brief explanation

Whenever you find an unvisited land cell, it's the start of a *new*
island — so count it, then "flood fill" outward from it (visit every
connected land cell and mark it as seen) so you never count the same island
twice. Once the flood fill finishes, keep scanning the grid for the next
unvisited land cell.

## Proposed solutions

### Medium to code — Flood fill (DFS) ✅ mostly accepted
Scan every cell. On an unvisited `'1'`, increment the island count and
recursively "sink" it — turn it and every land cell reachable from it into
`'0'` so it's never counted again.
**Time O(rows × cols) · Space O(rows × cols)** worst case (recursion depth
for one giant island).

## Reference implementation

See [`solutions/intermediate/p34numberofislands/NumberOfIslands.java`](../../solutions/intermediate/p34numberofislands/NumberOfIslands.java).
Try implementing it yourself first — the test in this folder expects
`NumberOfIslands#numIslands` to be filled in.
