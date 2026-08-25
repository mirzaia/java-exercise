# 35 — Course Schedule

**Tier:** Intermediate · **Source:** LeetCode 207 (Medium) · **Topics:** Graph, Topological Sort, DFS

## Problem

Courses have prerequisites (`[a, b]` means take `b` before `a`). Return
whether it's possible to take every course at all — i.e. there's no circular
dependency.

**Example:** `numCourses=2`, `prerequisites=[[1,0]]` → `true`;
`[[1,0],[0,1]]` → `false` (each needs the other first)

## Brief explanation

This is really "can this dependency graph be finished, or does it have a
cycle?" A course with zero remaining prerequisites can always be taken right
now. Take it, then reduce the prerequisite count for everything that
depended on it — if any of those newly reach zero, they become takeable too.
If you can eventually take every course this way, there's no cycle; if you
get stuck with courses left over, they're stuck in a cycle.

## Proposed solutions

### Medium to code — Topological sort (Kahn's algorithm, BFS) ✅ mostly accepted
Build the graph and count each course's remaining prerequisites
("in-degree"). Start a queue with every course that has zero prerequisites.
Repeatedly take a course from the queue, and decrement the in-degree of
everything that depends on it, enqueuing any that reach zero. If the total
number of courses taken equals `numCourses`, there's no cycle.
**Time O(V + E) · Space O(V + E)**

## Reference implementation

See [`solutions/intermediate/p35courseschedule/CourseSchedule.java`](../../solutions/intermediate/p35courseschedule/CourseSchedule.java).
Try implementing it yourself first — the test in this folder expects
`CourseSchedule#canFinish` to be filled in.
