# 30 — Longest Palindromic Substring

**Tier:** Intermediate · **Source:** LeetCode 5 (Medium) · **Topics:** DP, Two Pointers, String

## Problem

Find the longest contiguous substring of `s` that reads the same forwards
and backwards.

**Example:** `"babad"` → `"bab"` (or `"aba"` — both are valid)

## Brief explanation

Every palindrome has a center — either a single middle character (odd
length, like `"bab"`) or a gap between two middle characters (even length,
like `"bb"`). If you try growing outward from every possible center and keep
the widest palindrome you find, you're guaranteed to find the longest one.

## Proposed solutions

### Easy to code — Brute force
Check every substring to see if it's a palindrome.
**Time O(n³) · Space O(1)** — correct, far too slow for long strings.

### Medium to code — Expand around center ✅ mostly accepted
For every index (and every gap between two indices, to cover even-length
palindromes), expand outward while the characters on both sides match, and
keep track of the widest palindrome found.
**Time O(n²) · Space O(1)**

## Reference implementation

See [`solutions/intermediate/p30longestpalindromicsubstring/LongestPalindromicSubstring.java`](../../solutions/intermediate/p30longestpalindromicsubstring/LongestPalindromicSubstring.java).
Try implementing it yourself first — the test in this folder expects
`LongestPalindromicSubstring#longestPalindrome` to be filled in.
