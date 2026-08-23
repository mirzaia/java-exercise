package com.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseStringTest {
    private final ReverseString solution = new ReverseString();

    @Test
    public void testReverseString() {
        char[] input1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(input1);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, input1);

        char[] input2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(input2);
        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, input2);
    }
}
