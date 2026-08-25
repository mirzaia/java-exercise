# 22 — Longest Substring Without Repeating Characters

**Tier:** Intermediate · **Source:** LeetCode 3 (Medium) · **Topics:** Sliding Window, Hash Map

## Problem

Find the length of the longest run of characters in `s` that contains no
repeats.

**Example:** `"abcabcbb"` → `3` (the substring `"abc"`)

## Brief explanation

Keep a "window" — a contiguous stretch of the string — that never contains a
duplicate. Grow the window by moving its right edge forward one character at
a time. If the new character already exists inside the window, shrink the
window from the left until the duplicate is gone, then keep growing.

## Proposed solutions

### Easy to code — Brute force
Check every possible substring for repeated characters.
**Time O(n³) · Space O(min(n, alphabet))** — correct, far too slow for long strings.

### Medium to code — Sliding window with last-seen index ✅ mostly accepted
Remember the last index each character was seen at. As you extend the
window's right edge, if the new character was last seen inside the current
window, jump the window's left edge to just past that earlier occurrence.
**Time O(n) · Space O(min(n, alphabet))**

## Reference implementation

See [`solutions/intermediate/p22longestsubstring/LongestSubstring.java`](../../solutions/intermediate/p22longestsubstring/LongestSubstring.java).
Try implementing it yourself first — the test in this folder expects
`LongestSubstring#lengthOfLongestSubstring` to be filled in.
