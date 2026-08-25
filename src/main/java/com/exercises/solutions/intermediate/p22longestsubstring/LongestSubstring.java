package com.exercises.solutions.intermediate.p22longestsubstring;

public class LongestSubstring {
    // Sliding window: expand right, and whenever a repeat is found, shrink
    // the window from the left past the previous occurrence. Time O(n), Space O(min(n, alphabet)).
    public int lengthOfLongestSubstring(String s) {
        java.util.Map<Character, Integer> lastSeen = new java.util.HashMap<>();
        int best = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }
            lastSeen.put(c, right);
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
