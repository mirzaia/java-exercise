package com.exercises.solutions.basic.p03palindromenumber;

public class PalindromeNumber {
    // Reverse half the digits mathematically, no string conversion.
    // Time O(log10 n), Space O(1).
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reverted = 0;
        while (x > reverted) {
            reverted = reverted * 10 + x % 10;
            x /= 10;
        }
        return x == reverted || x == reverted / 10;
    }
}
