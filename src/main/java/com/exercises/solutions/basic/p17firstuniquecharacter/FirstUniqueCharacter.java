package com.exercises.solutions.basic.p17firstuniquecharacter;

public class FirstUniqueCharacter {
    // Count each letter, then scan again for the first with count 1.
    // Time O(n), Space O(1) (bounded alphabet).
    public int firstUniqChar(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (counts[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
