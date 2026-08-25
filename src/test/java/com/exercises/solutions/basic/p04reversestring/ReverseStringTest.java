package com.exercises.solutions.basic.p04reversestring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {
    private final ReverseString solution = new ReverseString();

    @Test
    public void testReverseString() {
        char[] s1 = {'h','e','l','l','o'};
        solution.reverseString(s1);
        assertArrayEquals(new char[]{'o','l','l','e','h'}, s1);

        char[] s2 = {'H','a','n','n','a','h'};
        solution.reverseString(s2);
        assertArrayEquals(new char[]{'h','a','n','n','a','H'}, s2);
    }
}
