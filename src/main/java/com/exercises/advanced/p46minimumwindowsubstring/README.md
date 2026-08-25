# 46 — Minimum Window Substring

**Tier:** Advanced · **Source:** LeetCode 76 (Hard) · **Topics:** Sliding Window, Hash Map

## Problem

Find the shortest substring of `s` that contains every character of `t`,
including repeats. Return `""` if impossible.

**Example:** `s = "ADOBECODEBANC"`, `t = "ABC"` → `"BANC"`

## Brief explanation

Grow a window over `s` from the left until it contains everything `t`
needs — then, while it still qualifies, try shrinking it from the left to
see if a smaller window still works. Every time you have a *valid* window,
check if it's the smallest one found so far. This "grow, then shrink while
valid" pattern is the classic shape of sliding-window problems.

## Proposed solutions

### Hard to code — Sliding window with need/have counts ✅ mostly accepted
Count how many of each character `t` needs. Expand the window's right edge,
updating a "have" count; once every needed character's count is satisfied,
shrink the window's left edge as far as it stays valid, recording the
shortest valid window along the way.
**Time O(|s| + |t|) · Space O(|t|)**

## Reference implementation

See [`solutions/advanced/p46minimumwindowsubstring/MinimumWindowSubstring.java`](../../solutions/advanced/p46minimumwindowsubstring/MinimumWindowSubstring.java).
Try implementing it yourself first — the test in this folder expects
`MinimumWindowSubstring#minWindow` to be filled in.
