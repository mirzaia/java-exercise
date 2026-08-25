package com.exercises.solutions.basic.p01twosum;

/**
 * Reference solution for Problem 01: Two Sum.
 * See ../../../../../../../basic/p01twosum/README.md for the write-up.
 */
public class TwoSum {
    // One-pass hash map. Time O(n), Space O(n).
    public int[] twoSum(int[] nums, int target) {
        java.util.Map<Integer, Integer> seen = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
