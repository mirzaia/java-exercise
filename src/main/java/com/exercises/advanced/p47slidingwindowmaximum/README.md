# 47 — Sliding Window Maximum

**Tier:** Advanced · **Source:** LeetCode 239 (Hard) · **Topics:** Monotonic Deque, Sliding Window

## Problem

For every position of a size-`k` window sliding across `nums`, report the
window's maximum.

**Example:** `[1,3,-1,-3,5,3,6,7]`, k=3 → `[3,3,5,5,6,7]`

## Brief explanation

Recomputing the max every time the window slides is wasteful. Instead,
keep a list of "candidates that could still become the max," ordered from
biggest to smallest. Whenever a new number arrives, throw away any smaller
candidates behind it in the list — they can never win while the new, bigger
number is still in the window. The front of this list is always the current
max.

## Proposed solutions

### Easy to code — Recompute max each window
Slide the window one step at a time and scan all k elements for the max.
**Time O(n·k) · Space O(1)** — correct, too slow for large k.

### Hard to code — Monotonic deque of indices ✅ mostly accepted
Keep a deque of indices whose values are decreasing front-to-back. Before
adding a new index, pop off any trailing indices whose values are smaller
(they're now useless). Pop from the front any index that has slid out of the
window. The front of the deque is always the current window's max.
**Time O(n) · Space O(k)**

## Reference implementation

See [`solutions/advanced/p47slidingwindowmaximum/SlidingWindowMaximum.java`](../../solutions/advanced/p47slidingwindowmaximum/SlidingWindowMaximum.java).
Try implementing it yourself first — the test in this folder expects
`SlidingWindowMaximum#maxSlidingWindow` to be filled in.
