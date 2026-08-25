package com.exercises.solutions.advanced.p59networkdelaytime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NetworkDelayTimeTest {
    private final NetworkDelayTime solution = new NetworkDelayTime();

    @Test
    public void testNetworkDelayTime() {
        assertEquals(2, solution.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2));
        assertEquals(1, solution.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 1));
        assertEquals(-1, solution.networkDelayTime(new int[][]{{1, 2, 1}}, 2, 2));
    }
}
