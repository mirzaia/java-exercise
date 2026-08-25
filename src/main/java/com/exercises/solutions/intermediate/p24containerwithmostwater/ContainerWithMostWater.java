package com.exercises.solutions.intermediate.p24containerwithmostwater;

public class ContainerWithMostWater {
    // Two pointers from both ends; always move the shorter line inward,
    // since keeping it can never beat a taller replacement. Time O(n), Space O(1).
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int best = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            best = Math.max(best, area);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return best;
    }
}
