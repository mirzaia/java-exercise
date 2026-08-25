package com.exercises.solutions.intermediate.p26productofarrayexceptself;

public class ProductOfArrayExceptSelf {
    // For each index, the answer is (product of everything to its left)
    // times (product of everything to its right). Build both in one pass
    // each, reusing the output array for the left-products. Time O(n), Space O(1) extra (output excluded).
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return answer;
    }
}
