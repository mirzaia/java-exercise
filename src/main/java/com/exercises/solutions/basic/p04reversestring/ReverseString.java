package com.exercises.solutions.basic.p04reversestring;

public class ReverseString {
    // Two pointers swapping from both ends inward. Time O(n), Space O(1).
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
