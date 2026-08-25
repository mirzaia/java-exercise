# 04 — Reverse String

**Tier:** Basic · **Source:** LeetCode 344 (Easy) · **Topics:** Two Pointers, String

## Problem

Reverse a string given as a character array `s`, in-place, using O(1) extra memory.

**Example:** `['h','e','l','l','o']` → `['o','l','l','e','h']`

## Brief explanation

To reverse something in place without extra memory, swap the outermost pair
of characters, then move one step in from each end and swap again, repeating
until the two pointers meet in the middle.

## Proposed solutions

### Easy to code — Two pointers ✅ mostly accepted
Keep a `left` pointer at the start and `right` at the end. Swap them, then
move `left` forward and `right` backward until they cross.
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/basic/p04reversestring/ReverseString.java`](../../solutions/basic/p04reversestring/ReverseString.java).
Try implementing it yourself first — the test in this folder expects
`ReverseString#reverseString` to be filled in.
