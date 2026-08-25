package com.exercises.solutions.advanced.p62longestconsecutivesequence;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    // Put every number in a set. Only start counting a sequence from a
    // number that has no predecessor in the set (num - 1 absent) — that
    // guarantees each sequence is counted exactly once, from its true start.
    // Time O(n) average, Space O(n).
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);

        int best = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) { // only start counting at a sequence's beginning
                int length = 1;
                int current = num;
                while (numSet.contains(current + 1)) {
                    current++;
                    length++;
                }
                best = Math.max(best, length);
            }
        }
        return best;
    }
}
