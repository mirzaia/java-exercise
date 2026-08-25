# 56 — Largest Rectangle in Histogram

**Tier:** Advanced · **Source:** LeetCode 84 (Hard) · **Topics:** Monotonic Stack

## Problem

Given histogram bar heights (each of width 1), find the largest rectangle
that fits entirely under the skyline.

**Example:** `[2,1,5,6,2,3]` → `10`

## Brief explanation

Every bar could be the *shortest* bar in some rectangle — and if it is,
that rectangle can stretch left and right until it hits a bar shorter than
it. A stack that only ever holds bars in increasing height order lets you
detect exactly the moment a bar's rectangle is "finished": the instant you
hit a shorter bar, you know how far the taller ones on the stack could have
stretched.

## Proposed solutions

### Easy to code — Brute force
For every bar, expand left and right while taller-or-equal bars continue,
tracking the resulting rectangle.
**Time O(n²) · Space O(1)** — correct, too slow for large inputs.

### Hard to code — Monotonic increasing stack ✅ mostly accepted
Keep a stack of indices with increasing heights. When the next bar is
shorter than the stack's top, pop and finalize that bar's rectangle (its
height times how far it could stretch between its new neighbors). A
sentinel height of 0 at the end flushes anything left on the stack.
**Time O(n) · Space O(n)**

## Reference implementation

See [`solutions/advanced/p56largestrectangleinhistogram/LargestRectangleInHistogram.java`](../../solutions/advanced/p56largestrectangleinhistogram/LargestRectangleInHistogram.java).
Try implementing it yourself first — the test in this folder expects
`LargestRectangleInHistogram#largestRectangleArea` to be filled in.
