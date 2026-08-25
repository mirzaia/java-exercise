package com.exercises.solutions.intermediate.p23threesum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class ThreeSumTest {
    private final ThreeSum solution = new ThreeSum();

    private static Set<List<Integer>> normalize(List<List<Integer>> triplets) {
        Set<List<Integer>> result = new HashSet<>();
        for (List<Integer> t : triplets) {
            List<Integer> sorted = new ArrayList<>(t);
            Collections.sort(sorted);
            result.add(sorted);
        }
        return result;
    }

    @Test
    public void testThreeSum() {
        Set<List<Integer>> expected = Set.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
        assertEquals(expected, normalize(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4})));
        assertTrue(solution.threeSum(new int[]{0, 1, 1}).isEmpty());
        assertEquals(Set.of(List.of(0, 0, 0)), normalize(solution.threeSum(new int[]{0, 0, 0})));
    }
}
