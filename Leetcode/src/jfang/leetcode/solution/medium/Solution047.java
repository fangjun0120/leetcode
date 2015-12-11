package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Permutations II
 * @author jfang
 *
 */
public class Solution047 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int num: nums) {
            if (numMap.containsKey(num))
                numMap.put(num, numMap.get(num)+1);
            else
                numMap.put(num, 1);
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        appendNumber(result, new ArrayList<Integer>(), numMap, nums);
        return result;
    }

    private void appendNumber(List<List<Integer>> result, List<Integer> current, Map<Integer, Integer> numMap, int[] nums) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<Integer>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i-1] == nums[i])
                continue;
            if (numMap.get(nums[i]) > 0) {
                current.add(nums[i]);
                numMap.put(nums[i], numMap.get(nums[i])-1);
                appendNumber(result, current, numMap, nums);
                numMap.put(nums[i], numMap.get(nums[i])+1);
                current.remove(current.size()-1);
            }
        }
    }
}
