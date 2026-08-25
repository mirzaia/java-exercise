package com.exercises.solutions.intermediate.p25groupanagrams;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class GroupAnagramsTest {
    private final GroupAnagrams solution = new GroupAnagrams();

    private static Set<Set<String>> normalize(List<List<String>> groups) {
        Set<Set<String>> result = new HashSet<>();
        for (List<String> g : groups) result.add(new HashSet<>(g));
        return result;
    }

    @Test
    public void testGroupAnagrams() {
        List<List<String>> result = solution.groupAnagrams(
                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Set<Set<String>> expected = Set.of(
                Set.of("bat"), Set.of("nat", "tan"), Set.of("ate", "eat", "tea"));
        assertEquals(expected, normalize(result));
    }
}
