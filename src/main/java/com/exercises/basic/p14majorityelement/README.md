# 14 — Majority Element

**Tier:** Basic · **Source:** LeetCode 169 (Easy) · **Topics:** Array, Boyer-Moore Voting

## Problem

Given an array where one value appears more than `n/2` times, return that
value. It's guaranteed to exist.

**Example:** `[2,2,1,1,1,2,2]` → `2`

## Brief explanation

Imagine every occurrence of the majority value "cancels out" one occurrence
of any other value. Because the majority value appears more than half the
time, it can never be fully cancelled out — whatever survives at the end must
be it. That's the whole idea behind the Boyer-Moore voting trick below.

## Proposed solutions

### Easy to code — Hash map counts
Count every value's occurrences in a map, then return the one with count > n/2.
**Time O(n) · Space O(n)**

### Medium to code — Boyer-Moore voting ✅ mostly accepted
Keep a `candidate` and a `count`. If `count` hits zero, switch the candidate
to the current number. Increment count when the current number matches the
candidate, decrement otherwise. The candidate left standing is the majority.
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/basic/p14majorityelement/MajorityElement.java`](../../solutions/basic/p14majorityelement/MajorityElement.java).
Try implementing it yourself first — the test in this folder expects
`MajorityElement#majorityElement` to be filled in.
