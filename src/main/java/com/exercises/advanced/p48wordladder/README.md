# 48 — Word Ladder

**Tier:** Advanced · **Source:** LeetCode 127 (Hard) · **Topics:** Graph, BFS

## Problem

Transform `beginWord` into `endWord`, one letter at a time, where every
intermediate word must be in `wordList`. Return the shortest transformation
sequence's *length* (word count), or 0 if it's impossible.

**Example:** `"hit"` → `"cog"` via `hot → dot → dog → cog` → `5` words total

## Brief explanation

Think of every word as a node, with an edge between two words if they
differ by exactly one letter. The question becomes "what's the shortest path
from `beginWord` to `endWord` in this graph?" — and breadth-first search is
exactly the tool for shortest paths in a graph where every edge has the same
"cost" (one transformation).

## Proposed solutions

### Hard to code — BFS over one-letter-different words ✅ mostly accepted
From the current word, try changing each letter position to every other
letter of the alphabet; if the result is in the word list and hasn't been
visited, it's a neighbor — add it to the next BFS layer. The number of
layers processed when you reach `endWord` is the answer.
**Time O(n · L² · 26) · Space O(n · L)** where n is the word count and L is
the word length.

## Reference implementation

See [`solutions/advanced/p48wordladder/WordLadder.java`](../../solutions/advanced/p48wordladder/WordLadder.java).
Try implementing it yourself first — the test in this folder expects
`WordLadder#ladderLength` to be filled in.
