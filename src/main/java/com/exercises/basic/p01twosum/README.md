# 01 — Two Sum

**Tier:** Basic · **Source:** LeetCode 1 (Easy) · **Topics:** Array, Hash Map

## Problem

Given an array of integers `nums` and an integer `target`, return the indices of
the two numbers that add up to `target`. Each input has exactly one solution,
and you can't use the same element twice. Return the indices in any order.

**Example 1**
```
Input:  nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: nums[0] + nums[1] == 9, so we return [0, 1].
```

**Example 2**
```
Input:  nums = [3,2,4], target = 6
Output: [1,2]
```

## Brief explanation

You're looking for two numbers in the list that add up to a target value, and
you need to report *where* they are, not just what they are. The obvious way is
to check every pair of numbers — but that means comparing each number against
every other number, which gets slow fast as the list grows. The trick is to
remember what you've already seen: for every number, ask "have I already seen
the number that would complete this pair?" If you keep a running note of every
number you've seen and its position, you only need to walk the list once.

## Proposed solutions

### Easy to code — Brute force
Compare every pair of numbers with two nested loops.
**Time O(n²) · Space O(1)** — correct, but too slow once the list gets large.

### Medium to code — One-pass hash map ✅ mostly accepted
Walk the list once. For each number, first check if its complement
(`target - number`) is already in your hash map; if not, record the current
number and its index and move on.
**Time O(n) · Space O(n)** — the standard interview-accepted answer.

## Reference implementation

See [`solutions/basic/p01twosum/`](../../../solutions/basic/p01twosum/TwoSum.java).
Try implementing it yourself first — the test in this folder expects
`TwoSum#twoSum` to be filled in.
