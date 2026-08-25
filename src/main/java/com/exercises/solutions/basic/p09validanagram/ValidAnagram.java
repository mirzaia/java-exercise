package com.exercises.solutions.basic.p09validanagram;

public class ValidAnagram {
    // Count letters in s, subtract for t; any nonzero count means mismatch.
    // Time O(n), Space O(1) (bounded alphabet).
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int c : counts) {
            if (c != 0) return false;
        }
        return true;
    }
}
