package com.exercises.basic.p05fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    private final FizzBuzz solution = new FizzBuzz();

    @Test
    public void testFizzBuzz() {
        assertEquals(java.util.List.of("1","2","Fizz","4","Buzz"), solution.fizzBuzz(5));
        assertEquals(java.util.List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"),
                solution.fizzBuzz(15));
    }
}
