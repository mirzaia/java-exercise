# 09 — Valid Anagram

**Tier:** Basic · **Source:** LeetCode 242 (Easy) · **Topics:** Hash Map, Sorting, String

## Problem

Given two strings, return `true` if the second is an anagram of the first —
same letters, same counts, any order.

**Example:** `"anagram"`, `"nagaram"` → `true`

## Brief explanation

Two words are anagrams if they're made of exactly the same letters the same
number of times. So count how many of each letter is in the first word, then
"un-count" using the second word — if you end up back at zero for every
letter, they matched.

## Proposed solutions

### Easy to code — Sort and compare
Sort both strings' characters and check if the results are equal.
**Time O(n log n) · Space O(n)**

### Medium to code — Letter counts ✅ mostly accepted
Use a 26-length array (lowercase English letters) as a counter: increment for
each letter of `s`, decrement for each letter of `t`. If every count is zero
at the end, and the lengths matched, they're anagrams.
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/basic/p09validanagram/ValidAnagram.java`](../../solutions/basic/p09validanagram/ValidAnagram.java).
Try implementing it yourself first — the test in this folder expects
`ValidAnagram#isAnagram` to be filled in.
