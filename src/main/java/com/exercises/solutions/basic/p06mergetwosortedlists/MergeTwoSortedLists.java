package com.exercises.solutions.basic.p06mergetwosortedlists;

import com.exercises.common.ListNode;

public class MergeTwoSortedLists {
    // Dummy head + walk both lists picking the smaller front each time.
    // Time O(n + m), Space O(1) extra (excluding the output list itself).
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
}
