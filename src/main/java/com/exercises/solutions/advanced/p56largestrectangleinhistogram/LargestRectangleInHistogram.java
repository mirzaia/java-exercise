package com.exercises.solutions.advanced.p56largestrectangleinhistogram;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogram {
    // Monotonic increasing stack of bar indices. When a shorter bar is
    // found, it means every bar still on the stack that's taller can't
    // extend any further right, so pop and finalize each one's best
    // rectangle (width = distance between the new shorter bound and
    // whatever's now below it on the stack). Time O(n), Space O(n).
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int best = 0;
        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];
            while (!stack.isEmpty() && heights[stack.peek()] >= h) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                best = Math.max(best, height * width);
            }
            stack.push(i);
        }
        return best;
    }
}
