package jfang.leetcode.test;

import jfang.leetcode.solution.medium.Solution031;

public class Test031 {

    public static void main(String[] args) {
        Solution031 obj = new Solution031();
        int[] nums = {1,3,2};
        obj.nextPermutation(nums);
        System.out.println(nums[0] + "," + nums[1] + "," + nums[2]);
    }
}
