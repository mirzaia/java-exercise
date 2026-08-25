package com.exercises.solutions.advanced.p58coursescheduleii;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {
    // Same Kahn's algorithm as Course Schedule, but record the order
    // courses are taken instead of just counting them. Time O(V + E), Space O(V + E).
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        int[] indegree = new int[numCourses];
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) queue.add(i);
        }
        int[] order = new int[numCourses];
        int index = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            order[index++] = course;
            for (int next : graph.get(course)) {
                if (--indegree[next] == 0) queue.add(next);
            }
        }
        return index == numCourses ? order : new int[0];
    }
}
