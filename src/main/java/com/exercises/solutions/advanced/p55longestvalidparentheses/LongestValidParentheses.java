package com.exercises.solutions.advanced.p55longestvalidparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestValidParentheses {
    // Stack of indices, seeded with -1 as a "base" for length calculations.
    // Push every '(' index. On ')', pop; if the stack becomes empty, this
    // ')' is a new base (push its index); otherwise the current valid run
    // length is i - stack.peek(). Time O(n), Space O(n).
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        int best = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    best = Math.max(best, i - stack.peek());
                }
            }
        }
        return best;
    }
}
