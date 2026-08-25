package com.exercises.solutions.intermediate.p42lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    // LinkedHashMap in access-order mode already tracks recency for us:
    // touching an entry (get or put) moves it to the "most recent" end, and
    // removeEldestEntry lets us evict the least-recently-used entry
    // automatically once we're over capacity. Time O(1) average per call.
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}
