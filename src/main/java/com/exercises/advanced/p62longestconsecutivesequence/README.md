# 62 — Longest Consecutive Sequence

**Tier:** Advanced · **Source:** LeetCode 128 (Medium) · **Topics:** Hash Set, Array

## Problem

Given an unsorted array, find the length of the longest run of
back-to-back integers (e.g. `2,3,4`), in O(n) time.

**Example:** `[100,4,200,1,3,2]` → `4` (the run `1,2,3,4`)

## Brief explanation

Sorting would work but costs O(n log n); you can do better. Put every
number in a hash set for instant "does this number exist?" checks. The key
trick: only start counting a sequence from a number that has *no*
predecessor in the set — that guarantees you count each run exactly once,
starting from its true beginning, instead of re-walking the same run
repeatedly from every position inside it.

## Proposed solutions

### Easy to code — Sort first
Sort the array, then scan for the longest run of consecutive values.
**Time O(n log n) · Space O(n)** (or O(1) if sorting in place) — correct but
not O(n).

### Medium to code — Hash set, count only from sequence starts ✅ mostly accepted
Put all numbers in a set. For each number that has no `number - 1` in the
set (meaning it's the start of a run), count forward (`number + 1`,
`number + 2`, ...) while those values exist in the set.
**Time O(n) average · Space O(n)**

## Reference implementation

See [`solutions/advanced/p62longestconsecutivesequence/LongestConsecutiveSequence.java`](../../solutions/advanced/p62longestconsecutivesequence/LongestConsecutiveSequence.java).
Try implementing it yourself first — the test in this folder expects
`LongestConsecutiveSequence#longestConsecutive` to be filled in.
