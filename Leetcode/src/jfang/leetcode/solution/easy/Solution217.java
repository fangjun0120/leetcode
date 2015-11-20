package jfang.leetcode.solution.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplicate
 * @author jfang
 *
 */
public class Solution217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }
}
