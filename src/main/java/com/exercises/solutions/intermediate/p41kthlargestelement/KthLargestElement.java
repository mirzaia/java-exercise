package com.exercises.solutions.intermediate.p41kthlargestelement;

import java.util.PriorityQueue;

public class KthLargestElement {
    // Min-heap of size k: keep only the k largest values seen; the heap's
    // smallest element is the kth largest overall. Time O(n log k), Space O(k).
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
