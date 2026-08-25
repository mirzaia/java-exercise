package com.exercises.solutions.advanced.p58coursescheduleii;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseScheduleIITest {
    private final CourseScheduleII solution = new CourseScheduleII();

    @Test
    public void testFindOrder() {
        int[] order = solution.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}});
        assertEquals(4, order.length);
        // 0 must come before 1 and 2; both 1 and 2 must come before 3
        int pos0 = indexOf(order, 0), pos1 = indexOf(order, 1), pos2 = indexOf(order, 2), pos3 = indexOf(order, 3);
        assertTrue(pos0 < pos1 && pos0 < pos2 && pos1 < pos3 && pos2 < pos3);

        assertEquals(0, solution.findOrder(2, new int[][]{{1, 0}, {0, 1}}).length);
    }

    private int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == value) return i;
        return -1;
    }
}
