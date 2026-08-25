package com.exercises.solutions.basic.p12climbingstairs;

public class ClimbingStairs {
    // This is Fibonacci: ways(n) = ways(n-1) + ways(n-2). Time O(n), Space O(1).
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int prev2 = 1, prev1 = 2;
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
