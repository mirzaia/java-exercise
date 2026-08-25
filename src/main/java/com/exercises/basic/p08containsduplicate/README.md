# 08 — Contains Duplicate

**Tier:** Basic · **Source:** LeetCode 217 (Easy) · **Topics:** Array, Hash Set

## Problem

Given an array, return `true` if any value shows up more than once.

**Example:** `[1,2,3,1]` → `true`; `[1,2,3,4]` → `false`

## Brief explanation

You just need to notice if you've seen a number before. A hash set is
perfect for "have I seen this?" questions — checking membership and adding a
new item are both fast, on average constant time.

## Proposed solutions

### Easy to code — Hash set ✅ mostly accepted
Walk the array, trying to add each number to a set. If a number is already
in the set, you've found a duplicate.
**Time O(n) · Space O(n)**

## Reference implementation

See [`solutions/basic/p08containsduplicate/ContainsDuplicate.java`](../../solutions/basic/p08containsduplicate/ContainsDuplicate.java).
Try implementing it yourself first — the test in this folder expects
`ContainsDuplicate#containsDuplicate` to be filled in.
