# 05 — FizzBuzz

**Tier:** Basic · **Source:** LeetCode 412 (Easy) · **Topics:** Math, Simulation

## Problem

Given `n`, return a list of strings for `1..n` where multiples of 3 become
`"Fizz"`, multiples of 5 become `"Buzz"`, multiples of both become
`"FizzBuzz"`, and everything else is just the number as text.

## Brief explanation

There's no trick here — walk the numbers 1 to n and, for each, decide which
label applies. The only subtlety is order: check "divisible by both 3 and 5"
(or equivalently 15) before checking 3 or 5 alone, otherwise you'll print
"Fizz" for a number that should have been "FizzBuzz".

## Proposed solutions

### Easy to code — Simulation ✅ mostly accepted
Loop from 1 to n, test `i % 15 == 0` first, then `% 3`, then `% 5`, else the
number itself.
**Time O(n) · Space O(n)** for the output list.

## Reference implementation

See [`solutions/basic/p05fizzbuzz/FizzBuzz.java`](../../solutions/basic/p05fizzbuzz/FizzBuzz.java).
Try implementing it yourself first — the test in this folder expects
`FizzBuzz#fizzBuzz` to be filled in.
