package jfang.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution040 {
	
	public List<List<Integer>> combinationSum2(int[] num, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        Arrays.sort(num);
        helper(res, cur, num, 0, target);
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> cur, int[] arr, int start, int target) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        
        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i-1])
                continue;
            if (arr[i] <= target) {
                cur.add(arr[i]);
                helper(res, cur, arr, i+1, target-arr[i]);
                cur.remove(cur.size()-1);
            }
        }
        return;
    }
}
