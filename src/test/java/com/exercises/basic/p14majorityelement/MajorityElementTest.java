package com.exercises.basic.p14majorityelement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MajorityElementTest {
    private final MajorityElement solution = new MajorityElement();

    @Test
    public void testMajorityElement() {
        assertEquals(3, solution.majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
