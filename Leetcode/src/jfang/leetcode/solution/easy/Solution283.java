package jfang.leetcode.solution.easy;

/**
 * Move Zeroes
 * @author jfang
 *
 */
public class Solution283 {

    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (index != i)
                    nums[index] = nums[i];
                index++;
            }
        }
        while(index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
