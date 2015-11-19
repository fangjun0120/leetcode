package jfang.leetcode.solution.medium;
import java.util.ArrayList;
import java.util.List;


public class Solution077 {

	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        helper(res, cur, 1, n, k);
        return res;
    }
    
    private void helper(List<List<Integer>> res, ArrayList<Integer> cur, int start, int n, int k) {
        if (cur.size() == k) {
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        
        for (int i = start; i <= n; i++) {
            cur.add(i);
            helper(res, cur, i+1, n, k);
            cur.remove(cur.size()-1);
        }
        return;
    }
}
