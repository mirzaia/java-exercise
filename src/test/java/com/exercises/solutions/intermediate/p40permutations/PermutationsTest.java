package com.exercises.solutions.intermediate.p40permutations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class PermutationsTest {
    private final Permutations solution = new Permutations();

    @Test
    public void testPermute() {
        Set<List<Integer>> result = new HashSet<>(solution.permute(new int[]{1, 2, 3}));
        assertEquals(6, result.size());
        assertTrue(result.contains(List.of(1, 2, 3)));
        assertTrue(result.contains(List.of(3, 2, 1)));
    }
}
