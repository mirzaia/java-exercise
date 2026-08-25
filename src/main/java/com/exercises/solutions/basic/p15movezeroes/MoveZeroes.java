package com.exercises.solutions.basic.p15movezeroes;

public class MoveZeroes {
    // Two pointers: writePos tracks where the next non-zero should land.
    // Time O(n), Space O(1).
    public void moveZeroes(int[] nums) {
        int writePos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[writePos++] = num;
            }
        }
        while (writePos < nums.length) {
            nums[writePos++] = 0;
        }
    }
}
