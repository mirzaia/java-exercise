package com.exercises.solutions.advanced.p44medianoftwosortedarrays;

public class MedianOfTwoSortedArrays {
    // Binary search for the partition point in the smaller array such that
    // everything to the left of both partitions is <= everything to the
    // right. The median then comes directly from the four border values.
    // Time O(log(min(m, n))), Space O(1).
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);
        int m = nums1.length, n = nums2.length;
        int low = 0, high = m;
        int half = (m + n + 1) / 2;
        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = half - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted");
    }
}
