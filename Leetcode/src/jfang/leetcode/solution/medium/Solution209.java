package jfang.leetcode.solution.medium;

/**
 * Minimum Size Subarray Sum
 *
 * Created by jfang on 3/31/2016.
 */
public class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        int minLen = 0;
        int sum = 0;
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            // move the right side
            while (sum < s && right < nums.length) {
                sum += nums[right];
                right++;
            }
            if (sum >= s) {
                minLen = checkLength(left, right - 1, minLen);

                // move the left side
                while (sum >= s && left < right) {
                    sum -= nums[left];
                    left++;
                }
                minLen = checkLength(left, right, minLen);
            }

            if (minLen == 1)
                return 1;
        }
        return minLen;
    }

    // return updated min length
    private int checkLength(int left, int right, int minLen) {
        int length = right - left + 1;
        if (length == 1)
            return 1;
        if (length < minLen || minLen == 0) {
            minLen = length;
        }
        return minLen;
    }
}
