# 07 — Best Time to Buy and Sell Stock

**Tier:** Basic · **Source:** LeetCode 121 (Easy) · **Topics:** Array, DP, Greedy

## Problem

Given daily stock prices, pick one day to buy and a later day to sell to
maximize profit. Return the max profit, or `0` if you can't profit.

**Example:** `[7,1,5,3,6,4]` → `5` (buy at 1, sell at 6)

## Brief explanation

For every day, ask "if I sold today, what's the best profit, given the
cheapest price I could have bought at any earlier day?" You only need to
remember the lowest price seen so far as you scan left to right — you never
need to look back further than that one number.

## Proposed solutions

### Easy to code — Track running minimum ✅ mostly accepted
Scan once, keeping the lowest price seen so far. At each day, compute
`price - lowestSoFar` and keep the best of those values.
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/basic/p07besttimetobuyandsellstock/BestTimeToBuyAndSellStock.java`](../../solutions/basic/p07besttimetobuyandsellstock/BestTimeToBuyAndSellStock.java).
Try implementing it yourself first — the test in this folder expects
`BestTimeToBuyAndSellStock#maxProfit` to be filled in.
