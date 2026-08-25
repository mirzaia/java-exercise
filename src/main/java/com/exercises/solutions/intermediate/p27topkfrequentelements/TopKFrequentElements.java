package com.exercises.solutions.intermediate.p27topkfrequentelements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    // Bucket sort by frequency: bucket index = how many times a number
    // appeared, so the top-k are just the last few non-empty buckets.
    // Time O(n), Space O(n).
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.merge(num, 1, Integer::sum);
        }
        List<List<Integer>> buckets = new java.util.ArrayList<>();
        for (int i = 0; i <= nums.length; i++) buckets.add(new java.util.ArrayList<>());
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            buckets.get(entry.getValue()).add(entry.getKey());
        }
        int[] result = new int[k];
        int index = 0;
        for (int freq = buckets.size() - 1; freq >= 0 && index < k; freq--) {
            for (int num : buckets.get(freq)) {
                if (index == k) break;
                result[index++] = num;
            }
        }
        return result;
    }
}
