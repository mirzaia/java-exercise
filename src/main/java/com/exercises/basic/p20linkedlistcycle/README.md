# 20 — Linked List Cycle

**Tier:** Basic · **Source:** LeetCode 141 (Easy) · **Topics:** Linked List, Two Pointers (Floyd's)

## Problem

Given the head of a linked list, determine whether it loops back on itself
somewhere instead of ending in `null`.

**Example:** a list where the last node's `next` points back to an earlier
node → `true`

## Brief explanation

Think of two runners on the same track: a slow one moving one step at a
time, and a fast one moving two steps at a time. If the track is a straight
line, the fast runner reaches the end and stops. But if the track loops,
the fast runner will eventually lap the slow one and they'll collide —
that collision is proof of a cycle.

## Proposed solutions

### Easy to code — Hash set of visited nodes
Walk the list, adding each node to a set; if you ever revisit a node already
in the set, there's a cycle.
**Time O(n) · Space O(n)**

### Medium to code — Floyd's cycle detection (two pointers) ✅ mostly accepted
Move a `slow` pointer one step at a time and a `fast` pointer two steps at a
time. If they ever point to the same node, there's a cycle; if `fast` hits
the end of the list, there isn't.
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/basic/p20linkedlistcycle/LinkedListCycle.java`](../../solutions/basic/p20linkedlistcycle/LinkedListCycle.java).
Try implementing it yourself first — the test in this folder expects
`LinkedListCycle#hasCycle` to be filled in.
