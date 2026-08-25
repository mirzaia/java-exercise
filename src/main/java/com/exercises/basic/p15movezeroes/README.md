# 15 — Move Zeroes

**Tier:** Basic · **Source:** LeetCode 283 (Easy) · **Topics:** Two Pointers, Array

## Problem

Move every `0` in `nums` to the end, keeping the other numbers in their
original relative order, without allocating a new array.

**Example:** `[0,1,0,3,12]` → `[1,3,12,0,0]`

## Brief explanation

Walk through the array and keep a separate "next free slot" pointer. Every
time you find a non-zero number, place it at that pointer and advance the
pointer. By the time you've scanned everything, all the non-zero numbers
are packed at the front in order — you just need to fill the remaining
slots with zeroes.

## Proposed solutions

### Medium to code — Write pointer ✅ mostly accepted
Keep a `writePos` starting at 0. Scan the array; every non-zero value gets
copied to `nums[writePos]` and `writePos` advances. After the scan, fill
everything from `writePos` to the end with `0`.
**Time O(n) · Space O(1)**

## Reference implementation

See [`solutions/basic/p15movezeroes/MoveZeroes.java`](../../solutions/basic/p15movezeroes/MoveZeroes.java).
Try implementing it yourself first — the test in this folder expects
`MoveZeroes#moveZeroes` to be filled in.
