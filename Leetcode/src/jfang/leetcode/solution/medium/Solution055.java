package jfang.leetcode.solution.medium;

/**
 * Jump Game
 * @author jfang
 *
 */
public class Solution055 {

    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max)
                return false;
            if (max >= nums.length)
                return true;
            int jump = nums[i] + i;
            max = Math.max(jump, max);
        }
        return true;
    }
}
