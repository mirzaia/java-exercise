package com.exercises.solutions.advanced.p45mergeksortedlists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.exercises.common.ListNode;

public class MergeKSortedListsTest {
    private final MergeKSortedLists solution = new MergeKSortedLists();

    @Test
    public void testMergeKLists() {
        ListNode[] lists = {
                ListNode.fromArray(new int[]{1, 4, 5}),
                ListNode.fromArray(new int[]{1, 3, 4}),
                ListNode.fromArray(new int[]{2, 6})
        };
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 6}, ListNode.toArray(solution.mergeKLists(lists)));
        assertNull(solution.mergeKLists(new ListNode[]{}));
    }
}
