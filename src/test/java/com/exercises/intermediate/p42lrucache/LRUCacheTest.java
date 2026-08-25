package com.exercises.intermediate.p42lrucache;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LRUCacheTest {
    @Test
    public void testLRUCache() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));   // marks 1 as recently used
        cache.put(3, 3);                 // evicts 2 (least recently used)
        assertEquals(-1, cache.get(2));
        cache.put(4, 4);                 // evicts 1
        assertEquals(-1, cache.get(1));
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }
}
