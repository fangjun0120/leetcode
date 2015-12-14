package jfang.leetcode.solution.medium;

/**
 * Maximum Subarray
 * Divide and conquer
 * @author jfang
 *
 */
public class Solution053 {

    public int maxSubArray(int[] nums) {
        return subMaxInArray(nums, 0, nums.length-1);
    }
    
    private int subMaxInArray(int[] nums, int left, int right) {
        if (left > right)
            return Integer.MIN_VALUE;
        int mid = (left + right)/2;
        
        //left sub array
        int leftMax = subMaxInArray(nums, left, mid-1);
        
        // right sub array
        int rightMax = subMaxInArray(nums, mid+1, right);
        
        // max sum with mid element
        int max = nums[mid];
        int sum = nums[mid];
        int i = mid-1;
        while (i >= left) {
            sum += nums[i];
            if (sum > max)
                max = sum;
            i--;
        }
        sum = max;
        i = mid + 1;
        while (i <= right) {
            sum += nums[i];
            if (sum > max)
                max = sum;
            i++;
        }
        max = Math.max(max, leftMax);
        max = Math.max(max, rightMax);
        return max;
    }
}
