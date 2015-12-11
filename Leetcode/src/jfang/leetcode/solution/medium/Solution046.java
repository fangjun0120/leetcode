package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Permutations
 * without duplicate
 * @author jfang
 *
 */
public class Solution046 {

    public List<List<Integer>> permute(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        appendNumber(result, new ArrayList<Integer>(), numSet, nums);
        return result;
    }

    private void appendNumber(List<List<Integer>> result, List<Integer> current, Set<Integer> numSet, int[] nums) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<Integer>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!numSet.contains(nums[i])) {
                current.add(nums[i]);
                numSet.add(nums[i]);
                appendNumber(result, current, numSet, nums);
                numSet.remove(nums[i]);
                current.remove(current.size()-1);
            }
        }
    }
}
