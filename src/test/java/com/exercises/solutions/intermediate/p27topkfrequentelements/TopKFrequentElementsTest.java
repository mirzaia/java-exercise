package com.exercises.solutions.intermediate.p27topkfrequentelements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TopKFrequentElementsTest {
    private final TopKFrequentElements solution = new TopKFrequentElements();

    @Test
    public void testTopKFrequent() {
        int[] result = solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Set<Integer> resultSet = new HashSet<>();
        for (int v : result) resultSet.add(v);
        assertEquals(Set.of(1, 2), resultSet);

        assertArrayEquals(new int[]{1}, solution.topKFrequent(new int[]{1}, 1));
    }
}
