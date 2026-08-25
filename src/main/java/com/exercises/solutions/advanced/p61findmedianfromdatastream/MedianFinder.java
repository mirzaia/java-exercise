package com.exercises.solutions.advanced.p61findmedianfromdatastream;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    // Two heaps split the stream in half: a max-heap for the smaller half,
    // a min-heap for the larger half, kept balanced in size. The median is
    // then always at the top of one (or both) heaps. Time O(log n) per
    // add, O(1) per query, Space O(n).
    private final PriorityQueue<Integer> smallerHalf = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
    private final PriorityQueue<Integer> largerHalf = new PriorityQueue<>(); // min-heap

    public MedianFinder() {
    }

    public void addNum(int num) {
        smallerHalf.add(num);
        largerHalf.add(smallerHalf.poll());
        if (largerHalf.size() > smallerHalf.size()) {
            smallerHalf.add(largerHalf.poll());
        }
    }

    public double findMedian() {
        if (smallerHalf.size() > largerHalf.size()) {
            return smallerHalf.peek();
        }
        return (smallerHalf.peek() + largerHalf.peek()) / 2.0;
    }
}
