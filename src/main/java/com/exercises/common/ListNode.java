package com.exercises.common;

/** Shared singly-linked list node used across linked-list problems. */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /** Builds a list from an array, e.g. {1,2,3} -> 1 -> 2 -> 3. */
    public static ListNode fromArray(int[] values) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int v : values) {
            current.next = new ListNode(v);
            current = current.next;
        }
        return dummy.next;
    }

    /** Reads a list back into an array for easy assertions. */
    public static int[] toArray(ListNode head) {
        int length = 0;
        for (ListNode n = head; n != null; n = n.next) length++;
        int[] result = new int[length];
        int i = 0;
        for (ListNode n = head; n != null; n = n.next) result[i++] = n.val;
        return result;
    }
}
