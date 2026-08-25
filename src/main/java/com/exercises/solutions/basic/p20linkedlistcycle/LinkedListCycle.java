package com.exercises.solutions.basic.p20linkedlistcycle;

import com.exercises.common.ListNode;

public class LinkedListCycle {
    // Floyd's tortoise and hare: a fast pointer and a slow pointer will meet
    // if and only if there's a cycle. Time O(n), Space O(1).
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
