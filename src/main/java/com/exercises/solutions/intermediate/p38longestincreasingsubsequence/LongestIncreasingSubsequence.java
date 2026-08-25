package com.exercises.solutions.intermediate.p38longestincreasingsubsequence;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    // dp[i] = length of the longest increasing subsequence ending at i.
    // Time O(n^2), Space O(n).
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int best = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            best = Math.max(best, dp[i]);
        }
        return best;
    }
}
