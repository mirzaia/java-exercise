package com.exercises.solutions.intermediate.p35courseschedule;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseScheduleTest {
    private final CourseSchedule solution = new CourseSchedule();

    @Test
    public void testCanFinish() {
        assertTrue(solution.canFinish(2, new int[][]{{1, 0}}));
        assertFalse(solution.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
        assertTrue(solution.canFinish(4, new int[][]{{1, 0}, {2, 1}, {3, 2}}));
    }
}
