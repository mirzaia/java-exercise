package com.exercises.solutions.basic.p14majorityelement;

public class MajorityElement {
    // Boyer-Moore voting: a true majority element always survives a
    // cancel-out-in-pairs process. Time O(n), Space O(1).
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
