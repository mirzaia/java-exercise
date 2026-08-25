package com.exercises.solutions.basic.p20linkedlistcycle;

import com.exercises.common.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListCycleTest {
    private final LinkedListCycle solution = new LinkedListCycle();

    @Test
    public void testHasCycle() {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);
        a.next = b; b.next = c; c.next = d; d.next = b; // cycle back to b
        assertTrue(solution.hasCycle(a));

        assertFalse(solution.hasCycle(ListNode.fromArray(new int[]{1, 2})));
        assertFalse(solution.hasCycle(null));
    }
}
