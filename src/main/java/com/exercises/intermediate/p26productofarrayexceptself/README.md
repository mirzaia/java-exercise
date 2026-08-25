# 26 — Product of Array Except Self

**Tier:** Intermediate · **Source:** LeetCode 238 (Medium) · **Topics:** Array, Prefix/Suffix Products

## Problem

Return an array where each position holds the product of every number in
`nums` *except* the one at that position — without using division.

**Example:** `[1,2,3,4]` → `[24,12,8,6]`

## Brief explanation

"Everything except me" is the same as "everything to my left" multiplied by
"everything to my right." So build up the running product of everything to
the left of each index in one pass, then multiply in the running product of
everything to the right in a second pass, going the other direction.

## Proposed solutions

### Easy to code — Division (if zeros allowed division was ok)
Multiply everything together, then divide by each element. Fails whenever
the array contains a zero (division by zero) — not accepted for this problem.

### Medium to code — Prefix and suffix products ✅ mostly accepted
First pass (left to right): fill each slot with the product of everything
before it. Second pass (right to left): multiply each slot by the running
product of everything after it.
**Time O(n) · Space O(1)** extra space, not counting the output array.

## Reference implementation

See [`solutions/intermediate/p26productofarrayexceptself/ProductOfArrayExceptSelf.java`](../../solutions/intermediate/p26productofarrayexceptself/ProductOfArrayExceptSelf.java).
Try implementing it yourself first — the test in this folder expects
`ProductOfArrayExceptSelf#productExceptSelf` to be filled in.
