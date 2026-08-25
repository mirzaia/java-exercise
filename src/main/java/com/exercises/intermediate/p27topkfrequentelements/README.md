# 27 — Top K Frequent Elements

**Tier:** Intermediate · **Source:** LeetCode 347 (Medium) · **Topics:** Hash Map, Heap, Bucket Sort

## Problem

Return the `k` values from `nums` that appear most often.

**Example:** `[1,1,1,2,2,3]`, k=2 → `[1,2]`

## Brief explanation

First figure out how many times each number shows up. Then you just need
the `k` numbers with the highest counts — you don't actually need to fully
sort everything by frequency; bucketing numbers by "how many times did this
appear" and reading off the fullest buckets first gets you there without a
full sort.

## Proposed solutions

### Easy to code — Sort by frequency
Count occurrences into a map, then sort the entries by count descending and
take the first k.
**Time O(n log n) · Space O(n)**

### Medium to code — Bucket sort by frequency ✅ mostly accepted
Count occurrences, then create buckets indexed by count (0 up to n). Drop
each number into the bucket matching its count. Read off numbers starting
from the highest-index bucket until you have k.
**Time O(n) · Space O(n)**

## Reference implementation

See [`solutions/intermediate/p27topkfrequentelements/TopKFrequentElements.java`](../../solutions/intermediate/p27topkfrequentelements/TopKFrequentElements.java).
Try implementing it yourself first — the test in this folder expects
`TopKFrequentElements#topKFrequent` to be filled in.
