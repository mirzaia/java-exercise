package com.exercises.solutions.intermediate.p29searchinrotatedsortedarray;

public class SearchInRotatedSortedArray {
    // Modified binary search: at least one half of [left, mid] or [mid,
    // right] is always properly sorted, so check which half is sorted and
    // whether target lies in it. Time O(log n), Space O(1).
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[left] <= nums[mid]) { // left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
