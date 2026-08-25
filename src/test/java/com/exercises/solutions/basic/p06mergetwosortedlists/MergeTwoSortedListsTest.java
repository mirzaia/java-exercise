package com.exercises.solutions.basic.p06mergetwosortedlists;

import com.exercises.common.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists solution = new MergeTwoSortedLists();

    @Test
    public void testMergeTwoLists() {
        ListNode result = solution.mergeTwoLists(
                ListNode.fromArray(new int[]{1, 2, 4}), ListNode.fromArray(new int[]{1, 3, 4}));
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, ListNode.toArray(result));

        assertNull(solution.mergeTwoLists(null, null));
        assertArrayEquals(new int[]{0}, ListNode.toArray(solution.mergeTwoLists(null, ListNode.fromArray(new int[]{0}))));
    }
}
