# 49 — Implement Trie (Prefix Tree)

**Tier:** Advanced · **Source:** LeetCode 208 (Medium) · **Topics:** Trie, Design

## Problem

Build a trie (prefix tree) supporting `insert(word)`, `search(word)` (exact
match), and `startsWith(prefix)` (does any inserted word start this way?).

**Example:** insert `"apple"` → `search("apple")` true, `search("app")`
false, `startsWith("app")` true.

## Brief explanation

A trie is a tree where each edge is one character, so every path from the
root spells out a prefix. Words that share a prefix literally share the same
path through the tree. That shared structure is what makes prefix lookups
fast — you're just walking down one character at a time.

## Proposed solutions

### Medium to code — Nested hash maps ✅ mostly accepted
Each node holds a map from "next character" to child node, plus a flag for
"a word ends exactly here." Inserting/searching/prefix-checking all just
walk one character at a time from the root, following (or creating) child
nodes.
**Time O(L) per operation · Space O(total characters inserted)**, where L is
the word/prefix length.

## Reference implementation

See [`solutions/advanced/p49implementtrie/Trie.java`](../../solutions/advanced/p49implementtrie/Trie.java).
Try implementing it yourself first — the test in this folder expects
`Trie#insert / #search / #startsWith` to be filled in.
