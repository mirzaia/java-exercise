package com.exercises.solutions.intermediate.p37houserobber;

public class HouseRobber {
    // At each house, either skip it (keep the best so far) or rob it (best
    // from two houses back plus this house's money). Time O(n), Space O(1).
    public int rob(int[] nums) {
        int prev2 = 0, prev1 = 0;
        for (int num : nums) {
            int current = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
