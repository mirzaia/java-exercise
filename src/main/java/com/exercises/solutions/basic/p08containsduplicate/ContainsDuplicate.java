package com.exercises.solutions.basic.p08containsduplicate;

public class ContainsDuplicate {
    // Hash set: if adding a value fails, it was already there. Time O(n), Space O(n).
    public boolean containsDuplicate(int[] nums) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }
}
