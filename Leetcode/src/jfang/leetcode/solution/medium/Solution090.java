package jfang.leetcode.solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Subsets II
 * @author jfang
 *
 */
public class Solution090 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        appendNum(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }
    
    private void appendNum(List<List<Integer>> res, List<Integer> current, int[] nums, int index) {
        res.add(new ArrayList<Integer>(current));
        
        for (int i = index; i < nums.length; i++) {
            if (i == index || nums[i] != nums[i-1]) {
                current.add(nums[i]);
                appendNum(res, current, nums, i+1);
                current.remove(current.size()-1);
            }
        }
    }
}
