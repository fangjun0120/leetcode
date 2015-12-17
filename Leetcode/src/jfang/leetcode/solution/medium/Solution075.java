package jfang.leetcode.solution.medium;

/**
 * Sort Colors
 * @author jfang
 *
 */
public class Solution075 {

    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zeros++;
            else if (nums[i] == 1)
                ones++;
        }
        int index;
        for (index = 0; index < zeros; index++)
            nums[index] = 0;
        for (;index < zeros+ones; index++)
            nums[index] = 1;
        for (;index < nums.length; index++)
            nums[index] = 2; 
    }
}
