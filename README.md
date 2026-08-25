# Java Coding Interview Practice Project

A structured, offline-friendly workspace of 63 LeetCode-style algorithm challenges,
split evenly across **basic**, **intermediate**, and **advanced** tiers. Every
problem follows the same shape: a stub you implement, a test that starts red, a
worked reference solution, and a README explaining the approach in plain language.

---

## Project structure

```text
java-exercise/
├── pom.xml                     # Maven config (Java 17, JUnit 5, solutions profile)
├── mvnw, mvnw.cmd, .mvn/        # Maven Wrapper — no local Maven install needed
├── README.md                   # This guide
└── src/
    ├── main/java/com/exercises/
    │   ├── common/              # Shared ListNode / TreeNode helpers
    │   ├── basic/p01twosum/...          # 21 problems, one folder each
    │   ├── intermediate/p22longestsubstring/...   # 21 problems
    │   ├── advanced/p43trappingrainwater/...      # 21 problems
    │   └── solutions/{basic,intermediate,advanced}/p../  # reference implementations
    └── test/java/com/exercises/
        ├── {basic,intermediate,advanced}/p../<Name>Test.java   # tests the stub
        └── solutions/{basic,intermediate,advanced}/p../<Name>Test.java  # tests the reference
```

Each problem folder (e.g. `basic/p01twosum/`) contains exactly three things:

| File | Purpose |
|---|---|
| `README.md` | Problem statement, brief explanation, proposed solutions (with time/space complexity, ranked by how hard each is to code), and a link to the reference. |
| `<Name>.java` | The stub — a method signature with a `// TODO`. This is what you implement. |
| *(its test lives under `src/test/...`)* | Fails until you fill in the stub correctly. |

The matching `solutions/` folder holds a fully worked reference implementation with
its own passing test — useful to check your approach once you've had a real attempt,
or to see a second way to solve it.

---

## Getting started

### Prerequisites
Java 17+. That's it — Maven itself is *not* required; this repo bundles the
**Maven Wrapper**, so `./mvnw` downloads the right Maven version on first run (needs
network once, then works offline).

### 1. Pick a challenge
Browse `src/main/java/com/exercises/<tier>/`, or use the catalog table below to find
a problem by name or topic.

### 2. Read the problem's README
Open the `README.md` next to the stub. It has the problem statement, a plain-language
explanation of the approach, and complexity notes for each proposed solution.

### 3. Implement the stub
Fill in the `// TODO` in the `.java` file under `src/main/java/...`.

### 4. Run the test for just that problem
```bash
./mvnw test -Dtest=TwoSumTest
```

### 5. Run everything
```bash
./mvnw test               # your stubs — expect failures until you solve them
./mvnw test -Psolutions   # reference solutions only — should always be green
```

### 6. Compare against the reference
Once you have a passing solution (or are stuck), look at the matching file under
`src/main/java/com/exercises/solutions/<tier>/p../`.

---

## Catalog

63 problems total: 21 basic, 21 intermediate, 21 advanced. All are free (non-premium)
LeetCode problems — the LeetCode number is in every problem's own README.

### Basic (01–21)

| # | Problem | Topics | Path |
|---|---|---|---|
| 01 | Two Sum | Array, Hash Map | `basic/p01twosum/` |
| 02 | Valid Parentheses | Stack, String | `basic/p02validparentheses/` |
| 03 | Palindrome Number | Math | `basic/p03palindromenumber/` |
| 04 | Reverse String | Two Pointers, String | `basic/p04reversestring/` |
| 05 | FizzBuzz | Math, Simulation | `basic/p05fizzbuzz/` |
| 06 | Merge Two Sorted Lists | Linked List, Recursion | `basic/p06mergetwosortedlists/` |
| 07 | Best Time to Buy and Sell Stock | Array, DP, Greedy | `basic/p07besttimetobuyandsellstock/` |
| 08 | Contains Duplicate | Array, Hash Set | `basic/p08containsduplicate/` |
| 09 | Valid Anagram | Hash Map, Sorting, String | `basic/p09validanagram/` |
| 10 | Valid Palindrome | Two Pointers, String | `basic/p10validpalindrome/` |
| 11 | Maximum Subarray | Array, DP, Kadane's | `basic/p11maximumsubarray/` |
| 12 | Climbing Stairs | DP, Math | `basic/p12climbingstairs/` |
| 13 | Binary Search | Binary Search | `basic/p13binarysearch/` |
| 14 | Majority Element | Array, Boyer-Moore Voting | `basic/p14majorityelement/` |
| 15 | Move Zeroes | Two Pointers, Array | `basic/p15movezeroes/` |
| 16 | Merge Sorted Array | Two Pointers, Array | `basic/p16mergesortedarray/` |
| 17 | First Unique Character in a String | Hash Map, String | `basic/p17firstuniquecharacter/` |
| 18 | Invert Binary Tree | Tree, BFS/DFS, Recursion | `basic/p18invertbinarytree/` |
| 19 | Maximum Depth of Binary Tree | Tree, BFS/DFS, Recursion | `basic/p19maximumdepthofbinarytree/` |
| 20 | Linked List Cycle | Linked List, Two Pointers (Floyd's) | `basic/p20linkedlistcycle/` |
| 21 | Missing Number | Array, Math, Bit Manipulation | `basic/p21missingnumber/` |

### Intermediate (22–42)

| # | Problem | Topics | Path |
|---|---|---|---|
| 22 | Longest Substring Without Repeating Characters | Sliding Window, Hash Map | `intermediate/p22longestsubstring/` |
| 23 | 3Sum | Two Pointers, Sorting | `intermediate/p23threesum/` |
| 24 | Container With Most Water | Two Pointers, Greedy | `intermediate/p24containerwithmostwater/` |
| 25 | Group Anagrams | Hash Map, String, Sorting | `intermediate/p25groupanagrams/` |
| 26 | Product of Array Except Self | Array, Prefix/Suffix | `intermediate/p26productofarrayexceptself/` |
| 27 | Top K Frequent Elements | Hash Map, Heap, Bucket Sort | `intermediate/p27topkfrequentelements/` |
| 28 | Merge Intervals | Array, Sorting, Intervals | `intermediate/p28mergeintervals/` |
| 29 | Search in Rotated Sorted Array | Binary Search | `intermediate/p29searchinrotatedsortedarray/` |
| 30 | Longest Palindromic Substring | DP, Two Pointers, String | `intermediate/p30longestpalindromicsubstring/` |
| 31 | Binary Tree Level Order Traversal | Tree, BFS | `intermediate/p31binarytreelevelorder/` |
| 32 | Validate Binary Search Tree | Tree, DFS, Recursion | `intermediate/p32validatebst/` |
| 33 | Lowest Common Ancestor of a BST | Tree, BST, Recursion | `intermediate/p33lowestcommonancestorofbst/` |
| 34 | Number of Islands | Grid, BFS/DFS, Union-Find | `intermediate/p34numberofislands/` |
| 35 | Course Schedule | Graph, Topological Sort, DFS | `intermediate/p35courseschedule/` |
| 36 | Coin Change | DP | `intermediate/p36coinchange/` |
| 37 | House Robber | DP | `intermediate/p37houserobber/` |
| 38 | Longest Increasing Subsequence | DP, Binary Search | `intermediate/p38longestincreasingsubsequence/` |
| 39 | Subsets | Backtracking | `intermediate/p39subsets/` |
| 40 | Permutations | Backtracking | `intermediate/p40permutations/` |
| 41 | Kth Largest Element in an Array | Heap, Quickselect | `intermediate/p41kthlargestelement/` |
| 42 | LRU Cache | Hash Map, Doubly Linked List, Design | `intermediate/p42lrucache/` |

### Advanced (43–63)

| # | Problem | Topics | Path |
|---|---|---|---|
| 43 | Trapping Rain Water | Two Pointers, Monotonic Stack, DP | `advanced/p43trappingrainwater/` |
| 44 | Median of Two Sorted Arrays | Binary Search, Divide & Conquer | `advanced/p44medianoftwosortedarrays/` |
| 45 | Merge k Sorted Lists | Heap, Linked List, Divide & Conquer | `advanced/p45mergeksortedlists/` |
| 46 | Minimum Window Substring | Sliding Window, Hash Map | `advanced/p46minimumwindowsubstring/` |
| 47 | Sliding Window Maximum | Monotonic Deque, Sliding Window | `advanced/p47slidingwindowmaximum/` |
| 48 | Word Ladder | Graph, BFS | `advanced/p48wordladder/` |
| 49 | Implement Trie (Prefix Tree) | Trie, Design | `advanced/p49implementtrie/` |
| 50 | Word Search II | Trie, Backtracking, Grid DFS | `advanced/p50wordsearchii/` |
| 51 | Serialize and Deserialize Binary Tree | Tree, BFS/DFS, Design | `advanced/p51serializebinarytree/` |
| 52 | Binary Tree Maximum Path Sum | Tree, DFS, DP | `advanced/p52binarytreemaximumpathsum/` |
| 53 | Edit Distance | DP (2-D) | `advanced/p53editdistance/` |
| 54 | Regular Expression Matching | DP, Recursion | `advanced/p54regularexpressionmatching/` |
| 55 | Longest Valid Parentheses | Stack, DP | `advanced/p55longestvalidparentheses/` |
| 56 | Largest Rectangle in Histogram | Monotonic Stack | `advanced/p56largestrectangleinhistogram/` |
| 57 | N-Queens | Backtracking | `advanced/p57nqueens/` |
| 58 | Course Schedule II | Graph, Topological Sort | `advanced/p58coursescheduleii/` |
| 59 | Network Delay Time | Graph, Dijkstra | `advanced/p59networkdelaytime/` |
| 60 | Redundant Connection | Union-Find | `advanced/p60redundantconnection/` |
| 61 | Find Median from Data Stream | Two Heaps, Design | `advanced/p61findmedianfromdatastream/` |
| 62 | Longest Consecutive Sequence | Hash Set, Array | `advanced/p62longestconsecutivesequence/` |
| 63 | Longest Increasing Path in a Matrix | Grid DFS, Memoization | `advanced/p63longestincreasingpathinmatrix/` |

All paths are relative to `src/main/java/com/exercises/`. Each row's `README.md`
lives inside that path.

---

## How to find a challenge

- **By number or name** — use the catalog table above.
- **By topic** — search this README for the topic (e.g. "Backtracking", "Dijkstra",
  "Two Pointers") to see every problem that uses it.
- **By difficulty to attempt next** — work through basic before intermediate before
  advanced; within a tier, problems aren't ordered by difficulty, so skip around
  freely based on the topics you want to practice.
- **In your editor** — every problem folder is self-contained (`README.md` + stub),
  so `grep`/searching your IDE for a topic name or LeetCode number across
  `src/main/java/com/exercises/` also works well.

---

## Interview tips

- **Read the problem twice.** Confirm you understand every constraint before coding.
- **Think out loud.** Practice narrating your approach as you would in a real interview.
- **Consider edge cases.** Empty input, a single element, all-duplicate values, etc.
- **Dry run before testing.** Trace your code by hand on the example input first.
- **Compare, don't copy.** Once you have a working (or stuck) attempt, read the
  reference solution's README for the complexity trade-offs — understanding *why*
  one approach beats another is the actual interview skill.

**Happy coding!**
