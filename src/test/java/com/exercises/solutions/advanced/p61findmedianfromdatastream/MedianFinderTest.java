package com.exercises.solutions.advanced.p61findmedianfromdatastream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedianFinderTest {
    @Test
    public void testMedianFinder() {
        MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        assertEquals(1.5, finder.findMedian(), 1e-9);
        finder.addNum(3);
        assertEquals(2.0, finder.findMedian(), 1e-9);
    }
}
