# 37 — House Robber

**Tier:** Intermediate · **Source:** LeetCode 198 (Medium) · **Topics:** Dynamic Programming

## Problem

Houses in a row each hold some money, but you can't rob two adjacent
houses. Return the max total you can rob.

**Example:** `[1,2,3,1]` → `4` (rob houses 1 and 3: `1 + 3`)

## Brief explanation

At every house, you make one decision: skip it (your total stays whatever
it was after the previous house), or rob it (your total becomes whatever it
was *two* houses back, plus this house's money, since you can't have robbed
the one right before it). Keep taking the better of those two options as you
move down the street.

## Proposed solutions

### Medium to code — Bottom-up DP with two running values ✅ mostly accepted
Track just two numbers as you scan: `prev1` (best total ending at or before
the last house) and `prev2` (best total ending at or before two houses ago).
At each house, the new best is `max(prev1, prev2 + currentHouse)`.
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/intermediate/p37houserobber/HouseRobber.java`](../../solutions/intermediate/p37houserobber/HouseRobber.java).
Try implementing it yourself first — the test in this folder expects
`HouseRobber#rob` to be filled in.
