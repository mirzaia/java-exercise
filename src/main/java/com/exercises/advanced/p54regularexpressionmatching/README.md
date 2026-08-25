# 54 — Regular Expression Matching

**Tier:** Advanced · **Source:** LeetCode 10 (Hard) · **Topics:** Dynamic Programming, Recursion

## Problem

Implement regex matching for `.` (any single character) and `*` (zero or
more of the character before it), matching the *entire* string.

**Example:** `s = "aa"`, `p = "a*"` → `true`

## Brief explanation

The tricky part is `*`, because it creates a choice: either it matches
"zero copies" of the character before it (so you can skip both the character
and the `*` entirely), or it matches "one more copy" (consume one character
of `s` and stay on the same part of the pattern, since `*` can repeat). A DP
table over "does this prefix of s match this prefix of p" lets you explore
both choices without recomputing the same sub-question twice.

## Proposed solutions

### Hard to code — 2-D DP ✅ mostly accepted
Build `dp[i][j]` = does `s[0..i)` match `p[0..j)`. For a normal character or
`.`, it depends on `dp[i-1][j-1]` plus the current characters matching. For
`*`, it's true if either `dp[i][j-2]` (treat `x*` as matching nothing) or —
when the preceding pattern character matches the current `s` character —
`dp[i-1][j]` (consume one more matching character).
**Time O(m · n) · Space O(m · n)**

## Reference implementation

See [`solutions/advanced/p54regularexpressionmatching/RegularExpressionMatching.java`](../../solutions/advanced/p54regularexpressionmatching/RegularExpressionMatching.java).
Try implementing it yourself first — the test in this folder expects
`RegularExpressionMatching#isMatch` to be filled in.
