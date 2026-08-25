# 21 — Missing Number

**Tier:** Basic · **Source:** LeetCode 268 (Easy) · **Topics:** Array, Math, Bit Manipulation

## Problem

An array holds `n` distinct numbers taken from the range `0..n` (so exactly
one number in that range is missing). Find it.

**Example:** `[3,0,1]` → `2`

## Brief explanation

If nothing were missing, the numbers `0..n` would add up to a known,
fixed total (there's a simple formula for that). Since exactly one number is
missing, the *actual* sum of the array will be short of that expected total
by exactly the missing number.

## Proposed solutions

### Easy to code — Hash set
Put `0..n` in a set, then remove every number in `nums`; whatever's left is
the missing one.
**Time O(n) · Space O(n)**

### Medium to code — Sum formula ✅ mostly accepted
Compute the expected sum of `0..n` using `n*(n+1)/2`, subtract the actual
sum of the array; the difference is the missing number.
**Time O(n) · Space O(1)**

### Alternative — XOR
XOR all the numbers `0..n` together with all the array elements; matching
pairs cancel to 0, leaving only the missing number. Also O(n)/O(1), and
avoids any risk of integer overflow from summing.

## Reference implementation

See [`solutions/basic/p21missingnumber/MissingNumber.java`](../../solutions/basic/p21missingnumber/MissingNumber.java).
Try implementing it yourself first — the test in this folder expects
`MissingNumber#missingNumber` to be filled in.
