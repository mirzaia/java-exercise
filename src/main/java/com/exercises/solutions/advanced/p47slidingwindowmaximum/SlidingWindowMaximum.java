package com.exercises.solutions.advanced.p47slidingwindowmaximum;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    // Monotonic deque of indices, values decreasing front to back. The
    // front is always the max of the current window; drop indices that
    // fall out of the window, and drop trailing values smaller than the
    // one just added (they can never become the max while the new one is
    // still in range). Time O(n), Space O(k).
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
