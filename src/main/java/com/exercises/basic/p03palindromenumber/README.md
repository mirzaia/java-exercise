# 03 — Palindrome Number

**Tier:** Basic · **Source:** LeetCode 9 (Easy) · **Topics:** Math

## Problem

Given an integer `x`, return `true` if it reads the same forwards and backwards.

**Example:** `121` → `true`, `-121` → `false` (the `-` breaks the mirror), `10` → `false`

## Brief explanation

A palindrome reads the same from both ends. Negative numbers can never be
palindromes because of the leading minus sign. The simplest way to check is
to turn the number into text and compare it to its own reverse.

## Proposed solutions

### Easy to code — Convert to string
Turn the number into a string and compare it against its reversed self.
**Time O(d) · Space O(d)** where d is the number of digits.

### Medium to code — Reverse half the digits ✅ mostly accepted
Peel digits off the end of `x` and build up a reversed number until the
reversed part is >= what's left of `x`; then compare the two halves. Avoids
converting to a string and avoids overflow from reversing the whole number.
**Time O(log₁₀ x) · Space O(1)**

## Reference implementation

See [`solutions/basic/p03palindromenumber/PalindromeNumber.java`](../../solutions/basic/p03palindromenumber/PalindromeNumber.java).
Try implementing it yourself first — the test in this folder expects
`PalindromeNumber#isPalindrome` to be filled in.
