# 50 — Word Search II

**Tier:** Advanced · **Source:** LeetCode 212 (Hard) · **Topics:** Trie, Backtracking, Grid DFS

## Problem

Given a letter grid and a list of target words, find every target word
that can be traced out by moving between adjacent cells (up/down/left/right,
no reusing a cell within one word).

**Example:** words `["oath","pea","eat","rain"]` on a sample grid → `["oath","eat"]`

## Brief explanation

Searching for each word separately (like the single-word "Word Search"
problem) means re-walking a lot of the same board paths over and over.
Instead, combine all target words into one trie, then do one DFS pass over
the board that walks the trie *alongside* the board path — the moment a path
can't continue matching any word's prefix, that branch of the DFS stops.

## Proposed solutions

### Medium to code — DFS per word
For each word individually, DFS/backtrack over the board looking for that
exact word (the classic single-word Word Search approach).
**Time O(words × rows × cols × 4^L) · Space O(L)** — correct, but repeats a
lot of work across similar words.

### Hard to code — Trie + single combined DFS ✅ mostly accepted
Insert all target words into a trie. DFS from every board cell, walking down
the trie in lockstep with the board path; whenever a trie node marks the end
of a word, record it. Mark cells visited during the DFS path and unmark them
on backtrack.
**Time O(rows × cols × 4^L) · Space O(sum of word lengths)** for the trie.

## Reference implementation

See [`solutions/advanced/p50wordsearchii/WordSearchII.java`](../../solutions/advanced/p50wordsearchii/WordSearchII.java).
Try implementing it yourself first — the test in this folder expects
`WordSearchII#findWords` to be filled in.
