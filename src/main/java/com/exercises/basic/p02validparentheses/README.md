# 02 — Valid Parentheses

**Tier:** Basic · **Source:** LeetCode 20 (Easy) · **Topics:** Stack, String

## Problem

Given a string `s` containing just `(`, `)`, `{`, `}`, `[` and `]`, determine if it
is valid. A string is valid if every open bracket is closed by the same type of
bracket, and brackets close in the correct order.

**Example:** `"()[]{}"` → `true`, `"(]"` → `false`

## Brief explanation

You're checking that brackets nest correctly, like matching parentheses in code.
The key insight: whenever you hit a closing bracket, it must match the *most
recently opened* bracket that hasn't been closed yet — that "most recent
first" behavior is exactly what a stack gives you for free.

## Proposed solutions

### Medium to code — Stack ✅ mostly accepted
Push every opening bracket onto a stack. On a closing bracket, pop the stack
and check it matches; if the stack is empty or doesn't match, it's invalid.
At the end, the stack must be empty.
**Time O(n) · Space O(n)**

## Reference implementation

See [`solutions/basic/p02validparentheses/ValidParentheses.java`](../../solutions/basic/p02validparentheses/ValidParentheses.java).
Try implementing it yourself first — the test in this folder expects
`ValidParentheses#isValid` to be filled in.
