package com.exercises.solutions.advanced.p45mergeksortedlists;

import com.exercises.common.ListNode;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    // Min-heap holding the current front node of every list; always pull
    // the smallest, then push its successor. Time O(N log k), Space O(k),
    // where N is the total number of nodes and k is the number of lists.
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            if (node != null) heap.add(node);
        }
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while (!heap.isEmpty()) {
            ListNode smallest = heap.poll();
            current.next = smallest;
            current = current.next;
            if (smallest.next != null) heap.add(smallest.next);
        }
        return dummy.next;
    }
}
