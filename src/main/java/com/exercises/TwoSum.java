package com.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem 1: Two Sum
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {

    /**
     * YOUR SOLUTION — Brute Force
     * Time: O(n²) | Space: O(1)
     */
    public int[] twoSum(int[] nums, int target) {
      List<Integer> result = new ArrayList<>();

      for (int x = 0; x < nums.length; x++) {
        int check = nums[x];
        for (int y = x + 1; y < nums.length; y++) {
          if (check + nums[y] == target) {
            result.add(x);
            result.add(y);
            break;
          }
        }
      }
      return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // ──────────────────────────────────────────────────────
    // EASY — Two-Pass HashMap
    // Time: O(n) | Space: O(n)
    // Pass 1: load value→index mapping. Pass 2: look up complement.
    // Most intuitive optimisation after brute force.
    // ──────────────────────────────────────────────────────
    public int[] twoSumEasy(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    // ──────────────────────────────────────────────────────
    // MEDIUM — One-Pass HashMap
    // Time: O(n) | Space: O(n)
    // Check complement before storing — avoids the second pass
    // and the "same element" guard in one elegant stroke.
    // ──────────────────────────────────────────────────────
    public int[] twoSumMedium(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }

    // ──────────────────────────────────────────────────────
    // ADVANCED — Two-Pointer after Sorting
    // Time: O(n log n) | Space: O(n) for index tracking
    // Sort while keeping original indices, then converge
    // left/right pointers. Tougher to get right because
    // indices shift after sorting.
    // ──────────────────────────────────────────────────────
    public int[] twoSumAdvanced(int[] nums, int target) {
        // Bundle each value with its original index
        int n = nums.length;
        int[][] indexed = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexed[i][0] = nums[i];
            indexed[i][1] = i;
        }

        // Sort by value (keeps original index attached)
        java.util.Arrays.sort(indexed, java.util.Comparator.comparingInt(a -> a[0]));

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = indexed[left][0] + indexed[right][0];
            if (sum == target) {
                return new int[]{indexed[left][1], indexed[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        throw new IllegalArgumentException("No solution");
    }
}
