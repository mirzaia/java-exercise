package com.exercises.solutions.basic.p11maximumsubarray;

public class MaximumSubarray {
    // Kadane's algorithm: extend the running sum, or restart at the current
    // element if the running sum has gone negative. Time O(n), Space O(1).
    public int maxSubArray(int[] nums) {
        int best = nums[0];
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            best = Math.max(best, current);
        }
        return best;
    }
}
