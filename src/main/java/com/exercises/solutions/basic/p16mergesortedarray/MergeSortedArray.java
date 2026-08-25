package com.exercises.solutions.basic.p16mergesortedarray;

public class MergeSortedArray {
    // Fill nums1 from the back, always placing the larger of the two current
    // tail candidates. Avoids overwriting values not yet read. Time O(m+n), Space O(1).
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, write = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[write--] = nums1[i--];
            } else {
                nums1[write--] = nums2[j--];
            }
        }
    }
}
