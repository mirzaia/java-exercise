# 42 — LRU Cache

**Tier:** Intermediate · **Source:** LeetCode 146 (Medium) · **Topics:** Hash Map, Doubly Linked List, Design

## Problem

Design a fixed-size cache that evicts the *least recently used* entry when
it's full. `get(key)` returns the value (or -1) and counts as "using" the
key; `put(key, value)` inserts or updates and may trigger an eviction. Both
must run in O(1) on average.

**Example:** capacity 2 — put 1, put 2, get 1 (now 1 is "freshest"), put 3
evicts 2 (the least recently used), not 1.

## Brief explanation

You need two things at once: fast lookup by key (a hash map gives you
that), and a sense of "order of use" so you always know which entry to evict
(a doubly linked list, where using an entry moves it to one end, gives you
that). The two together are exactly what an LRU cache is built from.

## Proposed solutions

### Medium to code — LinkedHashMap in access-order mode ✅ mostly accepted
Java's `LinkedHashMap` can be configured to reorder itself so the
least-recently-accessed entry is always first, and it exposes a hook
(`removeEldestEntry`) to auto-evict once you're over capacity. This gets you
O(1) get/put "for free" from a well-known standard-library structure.
**Time O(1) average per operation · Space O(capacity)**

### Hard to code — Hash map + hand-rolled doubly linked list
Build the same idea manually: a hash map from key to a doubly-linked-list
node, where the list is kept in recency order so the tail is always the
next eviction candidate. This is what interviewers usually want you to
demonstrate you understand, even though `LinkedHashMap` does it for you in
production code.
**Time O(1) per operation · Space O(capacity)**

## Reference implementation

See [`solutions/intermediate/p42lrucache/LRUCache.java`](../../solutions/intermediate/p42lrucache/LRUCache.java).
Try implementing it yourself first — the test in this folder expects
`LRUCache#get / #put` to be filled in.
