package com.exercises.basic.p07besttimetobuyandsellstock;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BestTimeToBuyAndSellStockTest {
    private final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    @Test
    public void testMaxProfit() {
        assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
