# 53 — Edit Distance

**Tier:** Advanced · **Source:** LeetCode 72 (Hard) · **Topics:** Dynamic Programming (2-D)

## Problem

Find the minimum number of single-character insertions, deletions, or
replacements needed to turn `word1` into `word2`.

**Example:** `"horse"` → `"ros"` → `3` operations

## Brief explanation

Compare the two words from the end: if their last characters already
match, you've saved an operation and can focus on the rest of both words. If
they don't match, you have three choices — insert, delete, or replace — and
each one reduces the problem to a smaller version of itself (fewer
characters left to reconcile). A 2-D table lets you build up the answer for
every prefix-pair from the smallest up.

## Proposed solutions

### Hard to code — 2-D DP table ✅ mostly accepted
Build `dp[i][j]` = edit distance between the first `i` characters of
`word1` and the first `j` characters of `word2`. Base cases: converting from
or to an empty string costs `i` or `j` operations. Otherwise, if the current
characters match, carry over `dp[i-1][j-1]`; if not, take 1 plus the
cheapest of replace/delete/insert (`dp[i-1][j-1]`, `dp[i-1][j]`, `dp[i][j-1]`).
**Time O(m · n) · Space O(m · n)**

## Reference implementation

See [`solutions/advanced/p53editdistance/EditDistance.java`](../../solutions/advanced/p53editdistance/EditDistance.java).
Try implementing it yourself first — the test in this folder expects
`EditDistance#minDistance` to be filled in.
