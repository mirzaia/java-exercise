# 25 — Group Anagrams

**Tier:** Intermediate · **Source:** LeetCode 49 (Medium) · **Topics:** Hash Map, String, Sorting

## Problem

Given a list of words, group the ones that are anagrams of each other.

**Example:** `["eat","tea","tan","ate","nat","bat"]` →
`[["bat"],["nat","tan"],["ate","eat","tea"]]`

## Brief explanation

Anagrams are made of the exact same letters, so if you sort each word's
letters alphabetically, every anagram in a group produces the *same* sorted
string. That sorted string makes a perfect key for grouping words in a
hash map — words that hash to the same key are anagrams of each other.

## Proposed solutions

### Medium to code — Sorted-word key ✅ mostly accepted
For each word, sort its characters to build a key (e.g. `"eat"` → `"aet"`).
Use a hash map from that key to the list of original words sharing it, then
return the map's values.
**Time O(n · k log k) · Space O(n · k)** where k is average word length.

## Reference implementation

See [`solutions/intermediate/p25groupanagrams/GroupAnagrams.java`](../../solutions/intermediate/p25groupanagrams/GroupAnagrams.java).
Try implementing it yourself first — the test in this folder expects
`GroupAnagrams#groupAnagrams` to be filled in.
