# 58 — Course Schedule II

**Tier:** Advanced · **Source:** LeetCode 210 (Medium) · **Topics:** Graph, Topological Sort

## Problem

Same as problem 35, but instead of just yes/no, return one valid order to
take all the courses (or an empty array if it's impossible).

**Example:** `numCourses=4`, `prerequisites=[[1,0],[2,0],[3,1],[3,2]]` →
`[0,1,2,3]` (or `[0,2,1,3]` — either is valid).

## Brief explanation

This is the exact same idea as Course Schedule — repeatedly take courses
that have no remaining prerequisites — except this time you also *record*
the order you took them in, since that recorded order is itself a valid
answer.

## Proposed solutions

### Medium to code — Topological sort (Kahn's algorithm) ✅ mostly accepted
Identical to problem 35's approach, but append each course to a result array
as it's taken from the queue. If every course gets taken, the array is a
valid order; otherwise return an empty array.
**Time O(V + E) · Space O(V + E)**

## Reference implementation

See [`solutions/advanced/p58coursescheduleii/CourseScheduleII.java`](../../solutions/advanced/p58coursescheduleii/CourseScheduleII.java).
Try implementing it yourself first — the test in this folder expects
`CourseScheduleII#findOrder` to be filled in.
