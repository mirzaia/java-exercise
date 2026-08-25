package com.exercises.solutions.basic.p02validparentheses;

public class ValidParentheses {
    // Stack: push openers, pop-and-match on closers. Time O(n), Space O(n).
    public boolean isValid(String s) {
        java.util.Deque<Character> stack = new java.util.ArrayDeque<>();
        java.util.Map<Character, Character> pairs = java.util.Map.of(')', '(', ']', '[', '}', '{');
        for (char c : s.toCharArray()) {
            if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
