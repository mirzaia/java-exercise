# 55 — Longest Valid Parentheses

**Tier:** Advanced · **Source:** LeetCode 32 (Hard) · **Topics:** Stack, DP

## Problem

Find the length of the longest substring made up of well-formed
parentheses.

**Example:** `")()())"` → `4` (the substring `"()()"`)

## Brief explanation

A stack of *indices* (not characters) lets you measure length directly:
push the index of every `(`. When you see a `)`, pop — if that empties the
stack, this `)` has nothing to match, so it becomes a new "wall" (push its
own index instead). Otherwise, whatever's now on top of the stack marks the
start of the current valid run, so the run's length is simply the distance
from there to here.

## Proposed solutions

### Medium to code — DP
`dp[i]` = length of the longest valid substring ending exactly at index `i`.
Only positions holding `)` can be nonzero; work out the recurrence by
looking at what's just before the matching `(`.
**Time O(n) · Space O(n)**

### Hard to code — Stack of indices ✅ mostly accepted
Push a base index of -1 and every `(`'s index. On `)`, pop; if the stack is
now empty, push the current index as a new base; otherwise the current valid
length is `i - stack.peek()`.
**Time O(n) · Space O(n)**

## Reference implementation

See [`solutions/advanced/p55longestvalidparentheses/LongestValidParentheses.java`](../../solutions/advanced/p55longestvalidparentheses/LongestValidParentheses.java).
Try implementing it yourself first — the test in this folder expects
`LongestValidParentheses#longestValidParentheses` to be filled in.
