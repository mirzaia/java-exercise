# 10 — Valid Palindrome

**Tier:** Basic · **Source:** LeetCode 125 (Easy) · **Topics:** Two Pointers, String

## Problem

Given a string, ignore punctuation/spacing and case, and check if what's left
reads the same forwards and backwards.

**Example:** `"A man, a plan, a canal: Panama"` → `true`

## Brief explanation

This is the same two-pointer idea as reversing a string, except you skip
over any character that isn't a letter or digit, and you compare
case-insensitively (so `'A'` and `'a'` count as a match).

## Proposed solutions

### Easy to code — Two pointers ✅ mostly accepted
Walk from both ends inward. At each step, skip past any non-alphanumeric
character on either side, then compare the two letters/digits (lowercased).
Stop as soon as a mismatch is found, or the pointers cross.
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/basic/p10validpalindrome/ValidPalindrome.java`](../../solutions/basic/p10validpalindrome/ValidPalindrome.java).
Try implementing it yourself first — the test in this folder expects
`ValidPalindrome#isPalindrome` to be filled in.
