package com.exercises.solutions.basic.p07besttimetobuyandsellstock;

public class BestTimeToBuyAndSellStock {
    // Track the lowest price seen so far and the best profit if sold today.
    // Time O(n), Space O(1).
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
