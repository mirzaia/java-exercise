package com.exercises.solutions.intermediate.p39subsets;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class SubsetsTest {
    private final Subsets solution = new Subsets();

    @Test
    public void testSubsets() {
        Set<Set<Integer>> result = new HashSet<>();
        for (List<Integer> subset : solution.subsets(new int[]{1, 2, 3})) {
            result.add(new HashSet<>(subset));
        }
        Set<Set<Integer>> expected = Set.of(
                Set.of(), Set.of(1), Set.of(2), Set.of(1, 2),
                Set.of(3), Set.of(1, 3), Set.of(2, 3), Set.of(1, 2, 3));
        assertEquals(expected, result);
    }
}
