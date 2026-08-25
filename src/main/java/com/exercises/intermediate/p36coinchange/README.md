# 36 — Coin Change

**Tier:** Intermediate · **Source:** LeetCode 322 (Medium) · **Topics:** Dynamic Programming

## Problem

Given coin denominations and a target amount, find the minimum number of
coins that add up to exactly that amount (or `-1` if it can't be done).

**Example:** coins `[1,2,5]`, amount `11` → `3` (`5 + 5 + 1`)

## Brief explanation

The fewest coins to make amount `a` is 1 (for whichever coin you pick)
plus the fewest coins to make the *remaining* amount, `a - coin`. Since the
"remaining amount" sub-problem is smaller, you can build the answer for
every amount from 0 up to the target, reusing answers you've already
computed for smaller amounts.

## Proposed solutions

### Medium to code — Bottom-up DP ✅ mostly accepted
Build an array `dp` where `dp[a]` is the fewest coins for amount `a`.
`dp[0] = 0`. For every amount from 1 up to the target, try every coin: if the
coin fits, `dp[a] = min(dp[a], dp[a - coin] + 1)`. The answer is `dp[amount]`
(or `-1` if it was never reduced from "impossible").
**Time O(amount × number of coins) · Space O(amount)**

## Reference implementation

See [`solutions/intermediate/p36coinchange/CoinChange.java`](../../solutions/intermediate/p36coinchange/CoinChange.java).
Try implementing it yourself first — the test in this folder expects
`CoinChange#coinChange` to be filled in.
