package com.exercises.solutions.intermediate.p36coinchange;

import java.util.Arrays;

public class CoinChange {
    // Bottom-up DP: dp[a] = fewest coins to make amount a. Time O(amount * coins.length), Space O(amount).
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int a = 1; a <= amount; a++) {
            for (int coin : coins) {
                if (coin <= a) {
                    dp[a] = Math.min(dp[a], dp[a - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
