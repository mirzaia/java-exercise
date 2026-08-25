# 17 — First Unique Character in a String

**Tier:** Basic · **Source:** LeetCode 387 (Easy) · **Topics:** Hash Map, String

## Problem

Return the index of the first character in `s` that doesn't repeat anywhere
else in the string; `-1` if every character repeats.

**Example:** `"leetcode"` → `0` (the `'l'`)

## Brief explanation

You can't know if a character is "unique" just by looking at it once — you
need to know how many times it appears *anywhere* in the string. So do it in
two passes: first count every letter's total occurrences, then walk the
string again and return the first position where that letter's count is
exactly 1.

## Proposed solutions

### Easy to code — Count then scan ✅ mostly accepted
First pass: count occurrences of every letter (a 26-length array works for
lowercase English text). Second pass: return the index of the first
character whose count is 1.
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/basic/p17firstuniquecharacter/FirstUniqueCharacter.java`](../../solutions/basic/p17firstuniquecharacter/FirstUniqueCharacter.java).
Try implementing it yourself first — the test in this folder expects
`FirstUniqueCharacter#firstUniqChar` to be filled in.
