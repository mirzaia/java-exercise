# 38 — Longest Increasing Subsequence

**Tier:** Intermediate · **Source:** LeetCode 300 (Medium) · **Topics:** DP, Binary Search

## Problem

Find the length of the longest subsequence of `nums` that is strictly
increasing. The values don't need to be next to each other, just in the
same left-to-right order.

**Example:** `[10,9,2,5,3,7,101,18]` → `4` (the subsequence `[2,3,7,101]`)

## Brief explanation

For each number, ask: "what's the longest increasing run I could end *at
this number*?" That's 1 (just this number alone) plus the best answer among
every earlier, smaller number's own best run. Working this out left to
right, remembering each position's best-so-far, builds up the full answer.

## Proposed solutions

### Medium to code — DP, O(n²) ✅ mostly accepted
Keep `dp[i]` = length of the longest increasing subsequence ending exactly
at index `i`. For each `i`, look at every earlier `j`; if `nums[j] <
nums[i]`, `dp[i]` can be `dp[j] + 1`. The answer is the largest `dp[i]`.
**Time O(n²) · Space O(n)**

### Hard to code — Patience sorting with binary search
Maintain a list of "smallest possible tail" for increasing subsequences of
each length; binary search where each new number belongs. The list's final
length is the answer.
**Time O(n log n) · Space O(n)**

## Reference implementation

See [`solutions/intermediate/p38longestincreasingsubsequence/LongestIncreasingSubsequence.java`](../../solutions/intermediate/p38longestincreasingsubsequence/LongestIncreasingSubsequence.java).
Try implementing it yourself first — the test in this folder expects
`LongestIncreasingSubsequence#lengthOfLIS` to be filled in.
