package jfang.leetcode.solution.medium;

/**
 * Search for a Range
 * @author jfang
 *
 */
public class Solution034 {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = binarySearch(nums, target-0.5);
        res[1] = binarySearch(nums, target+0.5);
        if (res[0] == nums.length-1 || res[1] == -1 || res[0] == res[1]) {
            res[0] = -1;
            res[1] = -1;
        }
        else
            res[0]++;

        return res;
    }
    
    /**
     * return the index of the largest number that smaller than target.
     * return -1 if target is smaller than any element of the array
     */
    private int binarySearch(int[] nums, double target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target)
                left = mid+1;
            else
                right = mid-1;
        }
        return left-1;
    }
}
