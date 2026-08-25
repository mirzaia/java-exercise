package com.exercises.solutions.basic.p21missingnumber;

public class MissingNumber {
    // The numbers 0..n should sum to n*(n+1)/2; subtract the actual sum to
    // find the gap. Time O(n), Space O(1).
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
