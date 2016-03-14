package jfang.leetcode.solution.medium;

/**
 * Product of Array Except Self
 *
 * Created by jfang on 3/14/2016.
 */
public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        // product of elements from left side
        int[] leftCache = new int[nums.length];

        leftCache[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftCache[i] = leftCache[i-1] * nums[i-1];
        }
        int rightCache = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            result[i] = leftCache[i] * rightCache;
            rightCache *= nums[i];
        }
        return result;
    }
}
