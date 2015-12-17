package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Subsets
 * @author jfang
 *
 */
public class Solution078 {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        appendInteger(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }
    
    private void appendInteger(List<List<Integer>> result, List<Integer> current, int[] nums, int index) {
        result.add(new ArrayList<Integer>(current));
        
        if (index == nums.length)
            return;
        
        for (int i = 0; i < nums.length; i++) {
            if (index == 0 || nums[i] > current.get(index-1)) {
                current.add(nums[i]);
                appendInteger(result, current, nums, index+1);
                current.remove(current.size()-1);
            }
        }
    }
}
